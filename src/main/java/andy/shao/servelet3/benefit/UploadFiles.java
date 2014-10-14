package andy.shao.servelet3.benefit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet(urlPatterns="/upload")
@MultipartConfig(fileSizeThreshold=10, location="C:/upload", maxFileSize=1024*100, maxRequestSize=-1)
public class UploadFiles extends HttpServlet{
	private static final long serialVersionUID = -2595267767883260929L;

	private static final MultipartConfig CONFIG;
	static{
		CONFIG = UploadFiles.class.getAnnotation(MultipartConfig.class);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}
	
	protected String getFileName(Part part) {
		if(part == null) return null;
		
		String fileName = part.getHeader("content-disposition");
		if(fileName == null || fileName.trim().length()==0) return null;
		
		return fileName.substring(fileName.indexOf("filename=\"") + 10, fileName.lastIndexOf("\""));
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		Part part = null;
		
		try {
			part = req.getPart("file");
		} catch (IllegalStateException e) {
			if(CONFIG.maxFileSize() == -1){
				System.out.println("the Part in the request is larger than maxRequestSize.");
			} else if (CONFIG.maxRequestSize() == -1) {
				System.out.println("the request body is larger than maxFileSize.");
			} else {
				System.out.println("the request body is larger maxRequestSize, or any Part in the request is larger than maxFileSize.");
			}
			e.printStackTrace();
		}
		
		if(part == null){
			System.out.println("There is a exception about your upload. Check your input information, please.");
			return ;
		}
		
		String fileName = getFileName(part);
		
		System.out.println("contentType: " + part.getContentType());
		System.out.println("fileName: " + fileName);
		System.out.println("header name:");
		for(String headerName : part.getHeaderNames())
			System.out.println(headerName + " : " + part.getHeader(headerName));
		
		String saveName = System.currentTimeMillis() + fileName.substring(fileName.lastIndexOf("."));
		fileName.substring(fileName.lastIndexOf("."));
		
		System.out.println("save the file with new name: " + saveName);
		
		part.write(saveName);
	}
	
}
