import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
 
@WebService
public class TestwebService {
		@WebMethod(operationName="sayHello")
		public String sayHello(String ss){
			return "Hello world!    hello  "+ss;
		}
		
		@WebMethod(operationName="getSum")
		public int getSum(int a,int b){
			return a+b;
		}
		
		
	public static void main(String [] args){
		Endpoint.publish("http://localhost:8083/HelloWorld", new TestwebService());
		System.out.println("发布成功！");
	}
	
 
}