package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class xmltags_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_set_var_select_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_forEach_var_select;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_out_select_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_when_select;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_parse_xml_var_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_x_otherwise;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_x_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_set_var_select_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_forEach_var_select = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_out_select_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_when_select = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_set_var = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_parse_xml_var_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_x_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_x_choose.release();
    _jspx_tagPool_x_set_var_select_nobody.release();
    _jspx_tagPool_x_forEach_var_select.release();
    _jspx_tagPool_x_out_select_nobody.release();
    _jspx_tagPool_x_when_select.release();
    _jspx_tagPool_c_set_var.release();
    _jspx_tagPool_x_parse_xml_var_nobody.release();
    _jspx_tagPool_x_otherwise.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        \n");
      out.write("    ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \n");
      out.write("    ");
      if (_jspx_meth_x_parse_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_x_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      if (_jspx_meth_x_out_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    </br>\n");
      out.write("    ");
      if (_jspx_meth_x_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     <br>\n");
      out.write("     <table border=\"2px\"> \n");
      out.write("     ");
      if (_jspx_meth_x_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("     </table>\n");
      out.write("            \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("s1");
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_set_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_set_0.doInitBody();
      }
      do {
        out.write("\n");
        out.write("    <sale>\n");
        out.write("\t<sales>\n");
        out.write("\t\t<region>north</region>\n");
        out.write("\t\t<employees>150</employees>\n");
        out.write("\t\t<amount>115000</amount>\n");
        out.write("\t</sales>\n");
        out.write("\t\n");
        out.write("\t<sales>\n");
        out.write("\t\t<region>south</region>\n");
        out.write("\t\t<employees>125</employees>\n");
        out.write("\t\t<amount> 95000</amount>\n");
        out.write("\t</sales>\n");
        out.write("\t\n");
        out.write("\t<sales>\n");
        out.write("\t\t<region>east</region>\n");
        out.write("\t\t<employees>325</employees>\n");
        out.write("\t\t<amount>265000</amount>\n");
        out.write("\t</sales>\n");
        out.write("\t\n");
        out.write("\t<sales>\n");
        out.write("\t\t<region>west</region>\n");
        out.write("\t\t<employees>215</employees>\n");
        out.write("\t\t<amount>30500</amount>\n");
        out.write("\t</sales>\n");
        out.write("\t\t\n");
        out.write("    </sale>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_set_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_set_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
        out = _jspx_page_context.popBody();
    }
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_x_parse_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:parse
    org.apache.taglibs.standard.tag.rt.xml.ParseTag _jspx_th_x_parse_0 = (org.apache.taglibs.standard.tag.rt.xml.ParseTag) _jspx_tagPool_x_parse_xml_var_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ParseTag.class);
    _jspx_th_x_parse_0.setPageContext(_jspx_page_context);
    _jspx_th_x_parse_0.setParent(null);
    _jspx_th_x_parse_0.setXml((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${s1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_x_parse_0.setVar("output");
    int _jspx_eval_x_parse_0 = _jspx_th_x_parse_0.doStartTag();
    if (_jspx_th_x_parse_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
      return true;
    }
    _jspx_tagPool_x_parse_xml_var_nobody.reuse(_jspx_th_x_parse_0);
    return false;
  }

  private boolean _jspx_meth_x_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:set
    org.apache.taglibs.standard.tag.common.xml.SetTag _jspx_th_x_set_0 = (org.apache.taglibs.standard.tag.common.xml.SetTag) _jspx_tagPool_x_set_var_select_nobody.get(org.apache.taglibs.standard.tag.common.xml.SetTag.class);
    _jspx_th_x_set_0.setPageContext(_jspx_page_context);
    _jspx_th_x_set_0.setParent(null);
    _jspx_th_x_set_0.setVar("data");
    _jspx_th_x_set_0.setSelect("$output/sale/sales[2]/region");
    int _jspx_eval_x_set_0 = _jspx_th_x_set_0.doStartTag();
    if (_jspx_th_x_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_set_var_select_nobody.reuse(_jspx_th_x_set_0);
      return true;
    }
    _jspx_tagPool_x_set_var_select_nobody.reuse(_jspx_th_x_set_0);
    return false;
  }

  private boolean _jspx_meth_x_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_0 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_0.setPageContext(_jspx_page_context);
    _jspx_th_x_out_0.setParent(null);
    _jspx_th_x_out_0.setSelect("$data");
    int _jspx_eval_x_out_0 = _jspx_th_x_out_0.doStartTag();
    if (_jspx_th_x_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_0);
    return false;
  }

  private boolean _jspx_meth_x_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_x_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_x_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_x_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_x_choose_0.setParent(null);
    int _jspx_eval_x_choose_0 = _jspx_th_x_choose_0.doStartTag();
    if (_jspx_eval_x_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_x_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_x_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_x_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_x_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_x_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_choose.reuse(_jspx_th_x_choose_0);
      return true;
    }
    _jspx_tagPool_x_choose.reuse(_jspx_th_x_choose_0);
    return false;
  }

  private boolean _jspx_meth_x_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_x_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:when
    org.apache.taglibs.standard.tag.common.xml.WhenTag _jspx_th_x_when_0 = (org.apache.taglibs.standard.tag.common.xml.WhenTag) _jspx_tagPool_x_when_select.get(org.apache.taglibs.standard.tag.common.xml.WhenTag.class);
    _jspx_th_x_when_0.setPageContext(_jspx_page_context);
    _jspx_th_x_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_x_choose_0);
    _jspx_th_x_when_0.setSelect("$data='north'");
    int _jspx_eval_x_when_0 = _jspx_th_x_when_0.doStartTag();
    if (_jspx_eval_x_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            this is north region\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_x_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_when_select.reuse(_jspx_th_x_when_0);
      return true;
    }
    _jspx_tagPool_x_when_select.reuse(_jspx_th_x_when_0);
    return false;
  }

  private boolean _jspx_meth_x_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_x_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_x_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_x_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_x_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_x_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_x_choose_0);
    int _jspx_eval_x_otherwise_0 = _jspx_th_x_otherwise_0.doStartTag();
    if (_jspx_eval_x_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            this is not north region\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_x_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_x_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_otherwise.reuse(_jspx_th_x_otherwise_0);
      return true;
    }
    _jspx_tagPool_x_otherwise.reuse(_jspx_th_x_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_x_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:forEach
    org.apache.taglibs.standard.tag.common.xml.ForEachTag _jspx_th_x_forEach_0 = (org.apache.taglibs.standard.tag.common.xml.ForEachTag) _jspx_tagPool_x_forEach_var_select.get(org.apache.taglibs.standard.tag.common.xml.ForEachTag.class);
    _jspx_th_x_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_x_forEach_0.setParent(null);
    _jspx_th_x_forEach_0.setSelect("$output/sale/sales");
    _jspx_th_x_forEach_0.setVar("user");
    int[] _jspx_push_body_count_x_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_x_forEach_0 = _jspx_th_x_forEach_0.doStartTag();
      if (_jspx_eval_x_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("         <tr>\n");
          out.write("             <td>");
          if (_jspx_meth_x_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_x_forEach_0, _jspx_page_context, _jspx_push_body_count_x_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("             <td>");
          if (_jspx_meth_x_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_x_forEach_0, _jspx_page_context, _jspx_push_body_count_x_forEach_0))
            return true;
          out.write(" </td>\n");
          out.write("         </tr>\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_x_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_x_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_x_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_x_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_x_forEach_0.doFinally();
      _jspx_tagPool_x_forEach_var_select.reuse(_jspx_th_x_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_x_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_x_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_x_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_1 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_1.setPageContext(_jspx_page_context);
    _jspx_th_x_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_x_forEach_0);
    _jspx_th_x_out_1.setSelect("$user/region");
    int _jspx_eval_x_out_1 = _jspx_th_x_out_1.doStartTag();
    if (_jspx_th_x_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_1);
    return false;
  }

  private boolean _jspx_meth_x_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_x_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_x_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  x:out
    org.apache.taglibs.standard.tag.rt.xml.ExprTag _jspx_th_x_out_2 = (org.apache.taglibs.standard.tag.rt.xml.ExprTag) _jspx_tagPool_x_out_select_nobody.get(org.apache.taglibs.standard.tag.rt.xml.ExprTag.class);
    _jspx_th_x_out_2.setPageContext(_jspx_page_context);
    _jspx_th_x_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_x_forEach_0);
    _jspx_th_x_out_2.setSelect("$user/amount");
    int _jspx_eval_x_out_2 = _jspx_th_x_out_2.doStartTag();
    if (_jspx_th_x_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
      return true;
    }
    _jspx_tagPool_x_out_select_nobody.reuse(_jspx_th_x_out_2);
    return false;
  }
}
