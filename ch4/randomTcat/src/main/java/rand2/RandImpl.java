package rand2;

import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "rand2.RandService")
public class RandImpl implements RandService {
    private static final int maxRands = 16;

    @WebMethod
    @Override
    public int next1() {
        return new Random().nextInt();
    }

    @WebMethod
    @Override
    public int[] nextN(final int n) {
        final int k = (n > RandImpl.maxRands) ? RandImpl.maxRands : Math.abs(n);
        int[] rands = new int[k];

        Random r = new Random();
        for (int i = 0 ; i < k ; i++)
            rands[i] = r.nextInt();
        return rands;
    }

}
