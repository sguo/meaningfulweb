package org.meaningfulweb.util.http;

import java.io.IOException;
import java.io.InputStream;

public interface HttpClientService {

  public byte[] get(String url)
    throws HttpException;
  
  public byte[] get(InputStream in) throws IOException;

  public boolean ping(String url);

  public byte[] postAsBody(String url, String body, String mimeType,
    String encoding)
    throws HttpException;

}
