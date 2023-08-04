
package p1;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class ctag extends SimpleTagSupport {
    public void doTag() throws JspException,IOException
    {
        JspWriter out=getJspContext().getOut();
        out.println("hello, this is custom tag");
    }
}
