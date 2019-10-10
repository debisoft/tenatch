package firecat_work.default_host;

import java.lang.reflect.InvocationTargetException;;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.script.SimpleBindings;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.RhinoException;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.WrapFactory;

import jp.nihonsoft.weppli.IHttpWebletRequest;
import jp.nihonsoft.weppli.IHttpWebletResponse;
import jp.nihonsoft.weppli.WebletRtException;
import jp.nihonsoft.weppli.IWeppliContext;
import jp.nihonsoft.weppli.nsp.ANspPage;

import jp.nihonsoft.firecat.nsp.NspWritingBodyBufferImpl;
import jp.nihonsoft.firecat.nsp.ServerScriptRtException;
import jp.nihonsoft.firecat.nsp.rhino.RhinoEcmaScriptException;
import jp.nihonsoft.firecat.nsp.rhino.RhinoNspWritingBodyBufferWrapper;
import jp.nihonsoft.firecat.nsp.rhino.RhinoUtils;
import jp.nihonsoft.firecat.page.PageContextImpl;
import jp.nihonsoft.firecat.page.PageExecContext;
import jp.nihonsoft.firecat.util.MotorUtilsStaticRef;

public class template_1_nsp extends ANspPage
{
	private static String server_script = null;
	private static CompiledScript compiledScript = null;

	public void handleRequest(IHttpWebletRequest iHttpWebletRequest, IHttpWebletResponse iHttpWebletResponse)
	{
		IWeppliContext weppliContext = getWebletConfig().getWeppliContext();
		IHttpWebletRequest request = iHttpWebletRequest;
		IHttpWebletResponse response = iHttpWebletResponse;
		NspWritingBodyBufferImpl resOut = new NspWritingBodyBufferImpl(response, NspWritingBodyBufferImpl.DEFAULT_CHAR_BUFFER_SIZE);
		PageContextImpl pageContext = new PageContextImpl(weppliContext, request, response);
		PageExecContext pageExecContext = new PageExecContext();

		try
		{


			pageExecContext.setAttr("currOut", resOut);

			if(server_script == null)
			{
				server_script = "" // SERVER_SCRIPT_START_MARKER
				+ "response.setContentType(\"text/html; charset=ISO-8859-1\");\n" // ln=[1], char=[1], file=[/template_1.nsp]
				+ "request.setCharset(response.getCharset());\n" // ln=[1], char=[1], file=[/template_1.nsp]
				+ "resOut.print(\"\\n<!DOCTYPE HTML PUBLIC \\\"-//W3C//DTD HTML 4.0 Transitional//EN\\\"><html><HEAD>\\n<title>firecat webserver</title>\\n<META http-equiv=Content-Type content=\\\"text/html; charset=iso-8859-1\\\">\\n<link rel=\\\"icon\\\" href=\\\"favicon.ico\\\" type=\\\"image/x-icon\\\"> \\n<link rel=\\\"shortcut icon\\\" href=\\\"favicon.ico\\\" type=\\\"image/x-icon\\\"> \\n<link rel=\\\"stylesheet\\\" type=\\\"text/css\\\" href=\\\"default.css\\\" />\\n</HEAD>\\n<BODY>\\n<table>\\n<tr><td><b><a class=\\\"noline\\\" href=\\\"http://firecat.nihonsoft.org/\\\"><img src=\\\"images/icon_32.png\\\" border=\\\"0\\\" alt=\\\"firecat.nihonsoft.org\\\"> <font size=\\\"6\\\" color=\\\"#ff9900\\\">firecat</font></a></b><br />\\n<a class=\\\"noline\\\" href=\\\"http://research.nihonsoft.org\\\"><font size=\\\"2\\\" color=\\\"#999900\\\">Webpages Made Simple</font></a></td></tr>\\n</table>\\n<font color=\\\"#5D7992\\\">\\n\");\n" // ln=[1], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.pushContext();\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.setAttr(\"currTag\", pageTagManager.getTag(\"nsp\", \"PageTemplateBodyContent\"));\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setParentTag(pageExecContext.getBuriedAttr(\"currTag\"));\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setParentBodyBuffer(resOut.getRhinoNspBodyBufferWrapper());\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.setAttr(\"currTagContext\", weppliContext.createObject(\"Motor.TagContextImpl\"));\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setWeppliContext(weppliContext);\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setPageContext(pageContext);\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setRequest(request);\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setResponse(response);\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setTagContext(pageExecContext.getAttr(\"currTagContext\"));\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "resOut = RhinoUtils.createRhinoNspWritingBodyBufferWrapper(pageExecContext.getAttr(\"currTag\").getBodyBuffer());\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.getAttr(\"currTag\").initTagAttrs();\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleStartTag());\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "if((pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").CONT_EVAL))\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "{\n" // ln=[15], char=[1], file=[/template_1.nsp]
					+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").EVAL_TAG_BODY_AGAIN);\n" // ln=[15], char=[1], file=[/template_1.nsp]
					+ "while(pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").EVAL_TAG_BODY_AGAIN)\n" // ln=[15], char=[1], file=[/template_1.nsp]
					+ "{\n" // ln=[15], char=[1], file=[/template_1.nsp]
						+ "resOut.resetBuffer();\n" // ln=[15], char=[1], file=[/template_1.nsp]
						+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleBeforeBodyEval());\n" // ln=[15], char=[1], file=[/template_1.nsp]
						+ "if((pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").SKIP_TAG_BODY_EVAL))\n" // ln=[15], char=[1], file=[/template_1.nsp]
							+ "break;\n" // ln=[15], char=[1], file=[/template_1.nsp]
						+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleAfterBodyEval());\n" // ln=[15], char=[1], file=[/template_1.nsp]
					+ "}\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "}\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleEndTag());\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "resOut = pageExecContext.getAttr(\"currTag\").getParentBodyBuffer().getRhinoNspWritingBodyBufferWrapper();\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "pageExecContext.popContext();\n" // ln=[15], char=[1], file=[/template_1.nsp]
				+ "resOut.print(\"\\n</font>\\n<P><table>\\n<tr><td align=\\\"left\\\"><a class=\\\"powered\\\" href=\\\"http://firecat.nihonsoft.org/\\\"><img src=\\\"images/powered_by.png\\\" border=\\\"0\\\" alt=\\\"Powered by firecat\\\" /></a></td></tr>\\n</table></P></BODY>\\n</html>\\n\");\n" // ln=[15], char=[1], file=[/template_1.nsp]
				; // SERVER_SCRIPT_END_MARKER

			} // if(server_script == null)

			Context jsContext = Context.enter();
			jsContext.setOptimizationLevel(-1);

			try
			{
				Scriptable jsScope = jsContext.initStandardObjects();

				ScriptableObject.defineClass(jsScope, jp.nihonsoft.firecat.nsp.rhino.fesiext.Database.class);
				ScriptableObject.defineClass(jsScope, jp.nihonsoft.firecat.nsp.rhino.fesiext.RowSet.class);
				ScriptableObject.putProperty(jsScope, "RhinoUtils", Context.javaToJS(RhinoUtils.instance, jsScope));

				ScriptableObject.putProperty(jsScope, "pageTagManager", Context.javaToJS(pageTagManager, jsScope));
				ScriptableObject.putProperty(jsScope, "pageExecContext", Context.javaToJS(pageExecContext, jsScope));

				ScriptableObject.putProperty(jsScope, "request", Context.javaToJS(request, jsScope));
				ScriptableObject.putProperty(jsScope, "response", Context.javaToJS(response, jsScope));
				ScriptableObject.putProperty(jsScope, "resOut", Context.javaToJS(new RhinoNspWritingBodyBufferWrapper(resOut), jsScope));
				ScriptableObject.putProperty(jsScope, "weppliContext", Context.javaToJS(weppliContext, jsScope));
				ScriptableObject.putProperty(jsScope, "pageContext", Context.javaToJS(pageContext, jsScope));
				ScriptableObject.putProperty(jsScope, "sessionContext", Context.javaToJS(request.getSessionContext(), jsScope));
				ScriptableObject.putProperty(jsScope, "motorUtils", Context.javaToJS(MotorUtilsStaticRef.getStaticRef(), jsScope));

				jsContext.evaluateString(jsScope, server_script, "server_script", 1, null);

			} // try
			catch(IllegalAccessException iae)
			{
				throw new ServerScriptRtException(iae);
			} // catch(IllegalAccessException iae)
			catch(InstantiationException ie)
			{
				throw new ServerScriptRtException(ie);
			} // catch(InstantiationException ie)
			catch(InvocationTargetException ite)
			{
				throw new ServerScriptRtException(ite);
			} // catch(InvocationTargetException ite)
			finally
			{
				Context.exit();
			} // finally

			resOut.flush();
		} // try
		catch(RhinoException re)
		{
			throw new ServerScriptRtException(new RhinoEcmaScriptException(re, re.lineNumber()));
		} // catch(RhinoException re)
	} // public void handleHttpRequest(IHttpWebletRequest iHttpWebletRequest, IHttpWebletResponse iHttpWebletResponse)
} // public class template_1_nsp
