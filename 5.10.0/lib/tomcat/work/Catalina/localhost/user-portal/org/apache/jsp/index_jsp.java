/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.31
 * Generated at: 2020-07-28 15:14:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL;
import static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX;
import static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("static org.wso2.carbon.identity.core.util.IdentityUtil.getServerURL");
    _jspx_imports_classes.add("static org.wso2.carbon.utils.multitenancy.MultitenantConstants.TENANT_AWARE_URL_PREFIX");
    _jspx_imports_classes.add("static org.wso2.carbon.utils.multitenancy.MultitenantConstants.SUPER_TENANT_DOMAIN_NAME");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!--\n");
      out.write("* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.\n");
      out.write("*\n");
      out.write("* WSO2 Inc. licenses this file to you under the Apache License,\n");
      out.write("* Version 2.0 (the \"License\"); you may not use this file except\n");
      out.write("* in compliance with the License.\n");
      out.write("* You may obtain a copy of the License at\n");
      out.write("*\n");
      out.write("*     http://www.apache.org/licenses/LICENSE-2.0\n");
      out.write("*\n");
      out.write("* Unless required by applicable law or agreed to in writing,\n");
      out.write("* software distributed under the License is distributed on an\n");
      out.write("* \"AS IS\" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY\n");
      out.write("* KIND, either express or implied. See the License for the\n");
      out.write("* specific language governing permissions and limitations\n");
      out.write("* under the License.\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta charset=\"utf-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"/>\n");
      out.write("        <link href=\"/user-portal/libs/styles/css/wso2-default.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <title>WSO2 Identity Server</title>\n");
      out.write("\n");
      out.write("        <!-- runtime config -->\n");
      out.write("        <script src=\"/user-portal/runtime-config.js\"></script>\n");
      out.write("        <!-- runtime config -->\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            var getTenantPrefix = function() {\n");
      out.write("                return \"");
      out.print(TENANT_AWARE_URL_PREFIX);
      out.write("\";\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var getSuperTenant = function() {\n");
      out.write("                return \"");
      out.print(SUPER_TENANT_DOMAIN_NAME);
      out.write("\";\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var getTenantName = function() {\n");
      out.write("                var paths = window.location.pathname.split(\"/\");\n");
      out.write("                var tenantIndex = paths.indexOf(getTenantPrefix());\n");
      out.write("\n");
      out.write("                if (tenantIndex > 0) {\n");
      out.write("                    var tenantName = paths[tenantIndex + 1];\n");
      out.write("                    return (tenantName) ? tenantName : \"\";\n");
      out.write("                } else {\n");
      out.write("                    return \"\";\n");
      out.write("                }\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            var getTenantPath = function(tenantName) {\n");
      out.write("                return (tenantName !== \"\") ? \"/\" + getTenantPrefix() + \"/\" + tenantName : \"\";\n");
      out.write("            };\n");
      out.write("\n");
      out.write("            /**\n");
      out.write("             * =====================================================\n");
      out.write("             * Update below details according to your configuration\n");
      out.write("             * =====================================================\n");
      out.write("             */\n");
      out.write("\n");
      out.write("            // Update below with tenant user-portal application/service-provider details\n");
      out.write("            var serverOriginAddress = \"");
      out.print(getServerURL("", true, true));
      out.write("\";\n");
      out.write("            var clientOriginAddress = \"");
      out.print(getServerURL("", true, true));
      out.write("\";\n");
      out.write("\n");
      out.write("            var tenantName = getTenantName();\n");
      out.write("            var defaultUserPortalClientID = \"USER_PORTAL\";\n");
      out.write("            var tenantUserPortalClientID = defaultUserPortalClientID + \"_\" + tenantName;\n");
      out.write("\n");
      out.write("            /** ===================================================== */\n");
      out.write("\n");
      out.write("            if (!window.userConfig) {\n");
      out.write("                window.userConfig = {};\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            window[\"runConfig\"] = {\n");
      out.write("                appBaseName: window.userConfig.appBaseName || getTenantPath(tenantName) + \n");
      out.write("                    \"/user-portal\",\n");
      out.write("                clientHost: window.userConfig.clientHost || clientOriginAddress + getTenantPath(tenantName),\n");
      out.write("                clientOrigin: window.userConfig.clientOrigin || clientOriginAddress,\n");
      out.write("                clientID: window.userConfig.clientID ||\n");
      out.write("                    (getTenantPath(tenantName) === (\"/\" + getTenantPrefix() + \"/\" + tenantName)) ?\n");
      out.write("                    tenantUserPortalClientID : defaultUserPortalClientID,\n");
      out.write("                serverHost: window.userConfig.serverHost || serverOriginAddress + getTenantPath(tenantName),\n");
      out.write("                serverOrigin: window.userConfig.serverOrigin || serverOriginAddress,\n");
      out.write("                tenant: window.userConfig.tenant || (tenantName === \"\") ? getSuperTenant() : tenantName,\n");
      out.write("                tenantPath: window.userConfig.tenantPath || getTenantPath(tenantName)\n");
      out.write("            };\n");
      out.write("        </script>\n");
      out.write("    <link rel=\"shortcut icon\" href=\"/user-portal/favicon.ico\"></head>\n");
      out.write("    <body>\n");
      out.write("        <noscript>\n");
      out.write("            You need to enable JavaScript to run this app.\n");
      out.write("        </noscript>\n");
      out.write("        <div id=\"root\"></div>\n");
      out.write("    <script type=\"text/javascript\" src=\"/user-portal/main.js?06ef502de8ed11293737\"></script></body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
