package Pattern;

public class Mirror_Rigth_Triangle4 {
	
	public int size;
	
	public Mirror_Rigth_Triangle4(int size) {
		this(null);
		this.size=size;  // this is refer to golobal variable ,ambiguty reslove 
	}
	
	public Mirror_Rigth_Triangle4() {
		this(12);
		this.size=0;
		
				
	}
	
	public void setSize(int mysize)
	{
		this.size=mysize;
	}
	Mirror_Rigth_Triangle4(Mirror_Rigth_Triangle4 obj)
	{
		this.size=obj.size;
	}
	

}

class Test{
	
	
	public static void main(String[] args) {
		
		Mirror_Rigth_Triangle4 mirror_Reigth_Triangle4 =new Mirror_Rigth_Triangle4(12);
		int a =45;
		mirror_Reigth_Triangle4.size=a;
		mirror_Reigth_Triangle4.setSize(65);
		
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle5= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle6= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle7= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle8= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle9= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		
		Mirror_Rigth_Triangle4 mirror_Rigth_Triangle10= new Mirror_Rigth_Triangle4(mirror_Reigth_Triangle4);
		
		
		
		
	}
}
