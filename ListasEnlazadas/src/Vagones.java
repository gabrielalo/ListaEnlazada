
import java.awt.Canvas;

public class Vagones{
	Canvas can;
	Vagones sig;
	int cantp=0;
	
	public Vagones(int cantp){
		this.cantp = cantp;
	}	
	public Vagones(Canvas can){
		sig=null;
		this.can = can;
	}
	
	public int pasajeros(){  
		return cantp;
	}
}
