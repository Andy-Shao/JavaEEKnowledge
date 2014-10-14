package andy.shao.servelet3.benefit;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import javax.servlet.AsyncContext;
import javax.servlet.AsyncEvent;
import javax.servlet.AsyncListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/async", asyncSupported=true)
public class AsyncDemoServlet extends HttpServlet{
	private static final long serialVersionUID = 6875985064442591772L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		PrintWriter out = resp.getWriter();
		out.println("The servlet input time:" + new Date());
		System.out.println("The servlet input time:" + new Date());
		out.flush();
		
		System.out.println("build asyncContext.");
		AsyncContext ctx = req.startAsync(req, resp);
		ctx.addListener(new AsyncListener() {
			
			@Override
			public void onTimeout(AsyncEvent arg0) throws IOException {
				System.out.println("onTimeout:" + new Date());
			}
			
			@Override
			public void onStartAsync(AsyncEvent arg0) throws IOException {
				System.out.println("onStartAsync:" + new Date());
			}
			
			@Override
			public void onError(AsyncEvent arg0) throws IOException {
				System.out.println("onError:" + new Date());
			}
			
			@Override
			public void onComplete(AsyncEvent arg0) throws IOException {
				System.out.println("onComplete:" + new Date());
			}
		});
		System.out.println("Finish build asyncContext.");

		System.out.println("Start process async process.");
		new Thread(new Executor(ctx)).start();
		out.println("the servlet end time: " + new Date());
		System.out.println("the servlet end time: " + new Date());
		out.flush();
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doGet(req, resp);
	}

	class Executor implements Runnable{
		private AsyncContext ctx = null;
		public Executor(AsyncContext ctx) {
			this.ctx = ctx;
		}

		@Override
		public void run() {
			try {
				TimeUnit.SECONDS.sleep(10);
				PrintWriter out = ctx.getResponse().getWriter();
				out.println("Finished process time:" + new Date());
				System.out.println("Finished process time:" + new Date());
				out.flush();
				ctx.complete();
			} catch (InterruptedException | IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
