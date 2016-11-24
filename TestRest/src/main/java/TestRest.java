
import static spark.Spark.*;
public class TestRest{
	
	public static void main(String[] args){
		get("/rest", (req, res) -> "Hello Rest");
	}
}