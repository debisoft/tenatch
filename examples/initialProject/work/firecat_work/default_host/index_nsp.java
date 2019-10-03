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

public class index_nsp extends ANspPage
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
				+ "response.setContentType(\"text/html; charset=ISO-8859-1\");\n" // ln=[1], char=[1], file=[/index.nsp]
				+ "request.setCharset(response.getCharset());\n" // ln=[1], char=[1], file=[/index.nsp]
				+ "resOut.print(\"\\n\");\n" // ln=[1], char=[1], file=[/index.nsp]
				+ "pageExecContext.pushContext();\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.setAttr(\"currTag\", pageTagManager.getTag(\"nsp\", \"PageTemplate\"));\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setParentTag(pageExecContext.getBuriedAttr(\"currTag\"));\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setParentBodyBuffer(resOut.getRhinoNspBodyBufferWrapper());\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.setAttr(\"currTagContext\", weppliContext.createObject(\"Motor.TagContextImpl\"));\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setWeppliContext(weppliContext);\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setPageContext(pageContext);\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setRequest(request);\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTagContext\").setResponse(response);\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setTagContext(pageExecContext.getAttr(\"currTagContext\"));\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "resOut = RhinoUtils.createRhinoNspWritingBodyBufferWrapper(pageExecContext.getAttr(\"currTag\").getBodyBuffer());\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTag\").initTagAttrs();\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.getAttr(\"currTag\").setTagAttr(\"template_url\", \"template_1.nsp\");\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleStartTag());\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "if((pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").CONT_EVAL))\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "{\n" // ln=[2], char=[1], file=[/index.nsp]
					+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").EVAL_TAG_BODY_AGAIN);\n" // ln=[2], char=[1], file=[/index.nsp]
					+ "while(pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").EVAL_TAG_BODY_AGAIN)\n" // ln=[2], char=[1], file=[/index.nsp]
					+ "{\n" // ln=[2], char=[1], file=[/index.nsp]
						+ "resOut.resetBuffer();\n" // ln=[2], char=[1], file=[/index.nsp]
						+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleBeforeBodyEval());\n" // ln=[2], char=[1], file=[/index.nsp]
						+ "if((pageExecContext.getAttr(\"curr_ret_val\") == pageExecContext.getAttr(\"currTag\").SKIP_TAG_BODY_EVAL))\n" // ln=[2], char=[1], file=[/index.nsp]
							+ "break;\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "resOut.print(\"\\n<br />\\n\");\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "resOut.print(\"Hello from firecat! From Kento!!\");\n" // ln=[4], char=[1], file=[/index.nsp]
				+ "resOut.print(\"<br />\\n\\n\");\n" // ln=[4], char=[40], file=[/index.nsp]
				+ "\n" // ln=[6], char=[1], file=[/index.nsp]
				+ "var msg_today = \"The date today is \" + new Date() + \".\";\n" // ln=[7], char=[1], file=[/index.nsp]
				+ "\n" // ln=[8], char=[1], file=[/index.nsp]
				+ "resOut.print(\"\\n\\n\");\n" // ln=[6], char=[1], file=[/index.nsp]
				+ "resOut.print(msg_today);\n" // ln=[10], char=[1], file=[/index.nsp]
				+ "resOut.print(\"<br />\\n\\n\");\n" // ln=[10], char=[15], file=[/index.nsp]
				+ "\n" // ln=[12], char=[1], file=[/index.nsp]
				+ "resOut.println(\"Have a nice day!!\");\n" // ln=[13], char=[1], file=[/index.nsp]
				+ "\n" // ln=[14], char=[1], file=[/index.nsp]
				+ "resOut.print(\"\\n\\n<br />\\n\");\n" // ln=[12], char=[1], file=[/index.nsp]
						+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleAfterBodyEval());\n" // ln=[2], char=[1], file=[/index.nsp]
					+ "}\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "}\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.setAttr(\"curr_ret_val\", pageExecContext.getAttr(\"currTag\").handleEndTag());\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "resOut = pageExecContext.getAttr(\"currTag\").getParentBodyBuffer().getRhinoNspWritingBodyBufferWrapper();\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "pageExecContext.popContext();\n" // ln=[2], char=[1], file=[/index.nsp]
				+ "resOut.print(\"\\n\");\n" // ln=[17], char=[1], file=[/index.nsp]
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
} // public class index_nsp
