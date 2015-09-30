package predictions3;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;
import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

@Generated(value = {
    "wadl|file:/home/mkalin/jwsur2/ch3/wadl/wadl113/samples/ant/../predictions.wadl"
} , comments = "wadl2java, http://wadl.java.net" , date = "2013-03-02T19:16:12.894-06:00")
public class Localhost_Predictions3ResourcesP {

    public static class Root {

        public static class Create {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            @SuppressWarnings("unused")
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public Create(Client client , URI uri) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/create");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
            }

            @SuppressWarnings("unused")
            private Create(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T postXWwwFormUrlencodedAsTextPlain(Object input , Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
                ClientResponse response;
                response = resourceBuilder.method("POST" , ClientResponse.class , input);
                return response.getEntity(returnType);
            }

            public <T> T postXWwwFormUrlencodedAsTextPlain(Object input , GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
                ClientResponse response;
                response = resourceBuilder.method("POST" , ClientResponse.class , input);
                return response.getEntity(returnType);
            }

        }

        public static class DeleteIdD {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public DeleteIdD(Client client , URI uri , String idD) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/delete/{id: \\d+}");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
                this._templateAndMatrixParameterValues.put("id: \\d+" , idD);
            }

            private DeleteIdD(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T deleteAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("DELETE" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T deleteAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("DELETE" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            /**
             * Get id: \d+
             * 
             */
            public String getIdD() {
                return ((String) this._templateAndMatrixParameterValues.get("id: \\d+"));
            }

            /**
             * Duplicate state and set id: \d+
             * 
             */
            public Localhost_Predictions3ResourcesP.Root.DeleteIdD setIdD(String idD) {
                Map<String , Object> copyMap;
                copyMap = new HashMap<String , Object>(this._templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = this._uriBuilder.clone();
                copyMap.put("id: \\d+" , idD);
                return new Localhost_Predictions3ResourcesP.Root.DeleteIdD(this._client , copyUriBuilder , copyMap);
            }

        }

        public static class Json {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public Json(Client client , URI uri) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/json");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
            }

            private Json(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

        }

        public static class JsonIdD {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public JsonIdD(Client client , URI uri , String idD) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/json/{id: \\d+}");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
                this._templateAndMatrixParameterValues.put("id: \\d+" , idD);
            }

            private JsonIdD(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T getAsJson(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T getAsJson(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/json");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            /**
             * Get id: \d+
             * 
             */
            public String getIdD() {
                return ((String) this._templateAndMatrixParameterValues.get("id: \\d+"));
            }

            /**
             * Duplicate state and set id: \d+
             * 
             */
            public Localhost_Predictions3ResourcesP.Root.JsonIdD setIdD(String idD) {
                Map<String , Object> copyMap;
                copyMap = new HashMap<String , Object>(this._templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = this._uriBuilder.clone();
                copyMap.put("id: \\d+" , idD);
                return new Localhost_Predictions3ResourcesP.Root.JsonIdD(this._client , copyUriBuilder , copyMap);
            }

        }

        public static class Plain {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public Plain(Client client , URI uri) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/plain");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
            }

            private Plain(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T getAsTextPlain(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T getAsTextPlain(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

        }

        public static class Update {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public Update(Client client , URI uri) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/update");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
            }

            private Update(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T putXWwwFormUrlencodedAsTextPlain(Object input , Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
                ClientResponse response;
                response = resourceBuilder.method("PUT" , ClientResponse.class , input);
                return response.getEntity(returnType);
            }

            public <T> T putXWwwFormUrlencodedAsTextPlain(Object input , GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("text/plain");
                resourceBuilder = resourceBuilder.type("application/x-www-form-urlencoded");
                ClientResponse response;
                response = resourceBuilder.method("PUT" , ClientResponse.class , input);
                return response.getEntity(returnType);
            }

        }

        public static class Xml {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public Xml(Client client , URI uri) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/xml");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
            }

            private Xml(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

        }

        public static class XmlIdD {

            private Client _client;
            private Map<String , Object> _templateAndMatrixParameterValues;
            private URI _uri;
            private UriBuilder _uriBuilder;

            /**
             * Create new instance using existing Client instance
             * 
             */
            public XmlIdD(Client client , URI uri , String idD) {
                this._client = client;
                this._uri = uri;
                this._uriBuilder = UriBuilder.fromUri(uri);
                this._uriBuilder = this._uriBuilder.path("/xml/{id: \\d+}");
                this._templateAndMatrixParameterValues = new HashMap<String , Object>();
                this._templateAndMatrixParameterValues.put("id: \\d+" , idD);
            }

            private XmlIdD(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
                this._client = client;
                this._uriBuilder = uriBuilder.clone();
                this._templateAndMatrixParameterValues = map;
            }

            public <T> T getAsXml(Class<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            public <T> T getAsXml(GenericType<T> returnType) {
                UriBuilder localUriBuilder = this._uriBuilder.clone();
                WebResource resource =
                    this._client.resource(localUriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
                com.sun.jersey.api.client.WebResource.Builder resourceBuilder = resource.getRequestBuilder();
                resourceBuilder = resourceBuilder.accept("application/xml");
                ClientResponse response;
                response = resourceBuilder.method("GET" , ClientResponse.class);
                return response.getEntity(returnType);
            }

            /**
             * Get id: \d+
             * 
             */
            public String getIdD() {
                return ((String) this._templateAndMatrixParameterValues.get("id: \\d+"));
            }

            /**
             * Duplicate state and set id: \d+
             * 
             */
            public Localhost_Predictions3ResourcesP.Root.XmlIdD setIdD(String idD) {
                Map<String , Object> copyMap;
                copyMap = new HashMap<String , Object>(this._templateAndMatrixParameterValues);
                UriBuilder copyUriBuilder = this._uriBuilder.clone();
                copyMap.put("id: \\d+" , idD);
                return new Localhost_Predictions3ResourcesP.Root.XmlIdD(this._client , copyUriBuilder , copyMap);
            }

        }

        private Client _client;

        private Map<String , Object> _templateAndMatrixParameterValues;

        private URI _uri;

        private UriBuilder _uriBuilder;

        /**
         * Create new instance using existing Client instance
         * 
         */
        public Root(Client client , URI uri) {
            this._client = client;
            this._uri = uri;
            this._uriBuilder = UriBuilder.fromUri(uri);
            this._uriBuilder = this._uriBuilder.path("/");
            this._templateAndMatrixParameterValues = new HashMap<String , Object>();
        }

        private Root(Client client , UriBuilder uriBuilder , Map<String , Object> map) {
            this._client = client;
            this._uriBuilder = uriBuilder.clone();
            this._templateAndMatrixParameterValues = map;
        }

        public Localhost_Predictions3ResourcesP.Root.Create create() {
            return new Localhost_Predictions3ResourcesP.Root.Create(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
        }

        public Localhost_Predictions3ResourcesP.Root.DeleteIdD deleteIdD(String idD) {
            return new Localhost_Predictions3ResourcesP.Root.DeleteIdD(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues) , idD);
        }

        public Localhost_Predictions3ResourcesP.Root.Json json() {
            return new Localhost_Predictions3ResourcesP.Root.Json(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
        }

        public Localhost_Predictions3ResourcesP.Root.JsonIdD jsonIdD(String idD) {
            return new Localhost_Predictions3ResourcesP.Root.JsonIdD(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues) , idD);
        }

        public Localhost_Predictions3ResourcesP.Root.Plain plain() {
            return new Localhost_Predictions3ResourcesP.Root.Plain(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
        }

        public Localhost_Predictions3ResourcesP.Root.Update update() {
            return new Localhost_Predictions3ResourcesP.Root.Update(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
        }

        public Localhost_Predictions3ResourcesP.Root.Xml xml() {
            return new Localhost_Predictions3ResourcesP.Root.Xml(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues));
        }

        public Localhost_Predictions3ResourcesP.Root.XmlIdD xmlIdD(String idD) {
            return new Localhost_Predictions3ResourcesP.Root.XmlIdD(this._client ,
                this._uriBuilder.buildFromMap(this._templateAndMatrixParameterValues) , idD);
        }

    }

    /**
     * The base URI for the resource represented by this proxy
     * 
     */
    public final static URI BASE_URI;

    static {
        URI originalURI = URI.create("http://localhost:8080/predictions3/resourcesP/");
        // Look up to see if we have any indirection in the local copy
        // of META-INF/java-rs-catalog.xml file, assuming it will be in the
        // oasis:name:tc:entity:xmlns:xml:catalog namespace or similar duck type
        java.io.InputStream is =
            Localhost_Predictions3ResourcesP.class.getResourceAsStream("/META-INF/jax-rs-catalog.xml");
        if (is != null) try {
            // Ignore the namespace in the catalog, can't use wildcard until
            // we are sure we have XPath 2.0
            String found =
                javax.xml.xpath.XPathFactory
                    .newInstance()
                    .newXPath()
                    .evaluate("/*[name(.) = 'catalog']/*[name(.) = 'uri' and @name ='" + originalURI + "']/@uri" ,
                        new org.xml.sax.InputSource(is));
            if (found != null && found.length() > 0) originalURI = java.net.URI.create(found);

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (java.io.IOException e) {
            }
        }
        BASE_URI = originalURI;
    }

    public static Localhost_Predictions3ResourcesP.Root root() {
        return Localhost_Predictions3ResourcesP.root(Client.create() , Localhost_Predictions3ResourcesP.BASE_URI);
    }

    public static Localhost_Predictions3ResourcesP.Root root(Client client) {
        return Localhost_Predictions3ResourcesP.root(client , Localhost_Predictions3ResourcesP.BASE_URI);
    }

    public static Localhost_Predictions3ResourcesP.Root root(Client client , URI baseURI) {
        return new Localhost_Predictions3ResourcesP.Root(client , baseURI);
    }

}
