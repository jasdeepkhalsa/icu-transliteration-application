package googletranslate;

import java.io.StringWriter;

public class JSONStringer
  extends JSONWriter
{
  public JSONStringer()
  {
    super(new StringWriter());
  }
  
  public String toString()
  {
    return this.mode == 'd' ? this.writer.toString() : null;
  }
}


/* Location:              /home/jas/sites/icu-transliteration-application/Translit_Application.jar!/googletranslate/JSONStringer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */