import java.io.PrintWriter;
import java.io.StringWriter;


@SuppressWarnings("serial")
public class MyException extends Exception{
     public String getPrintStackTraceAsString(){
    	  StringWriter sw = new StringWriter();
    	  PrintWriter pw = new PrintWriter(sw);
    	  printStackTrace(pw);//将异常信息输入到pw(PrintWriter)中
    	  StringBuffer sb = sw.getBuffer();
    	  return sb.toString();
     }
}
