package service;

import com.sun.net.httpserver.HttpExchange;

@SuppressWarnings("restriction")
public interface IService {
    public void doDelete(HttpExchange e);

    public void doGet(HttpExchange e);

    public void doPost(HttpExchange e);

    public void doPut(HttpExchange e);
}
