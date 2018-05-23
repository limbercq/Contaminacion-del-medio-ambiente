package codigo;

public class codigo {
	private double estab[][]=new double [6][7];
	private double z,y,b,c;

	public codigo() {
		b=0.894;
				
		estab[0][0]=213;
		estab[0][1]=441;
		estab[0][2]=1.94;
		estab[0][3]=9.27;
		estab[0][4]=460;
		estab[0][5]=2.09;
		estab[0][6]=-1;
		
		estab[1][0]=156;
		estab[1][1]=107;
		estab[1][2]=1.15;
		estab[1][3]=3.3;
		estab[1][4]=108;
		estab[1][5]=1.1;
		estab[1][6]=2;
		
		estab[2][0]=104;
		estab[2][1]=61;
		estab[2][2]=0.91;
		estab[2][3]=0;
		estab[2][4]=61;
		estab[2][5]=0.91;
		estab[2][6]=0;
		
		estab[3][0]=68;
		estab[3][1]=33.2;
		estab[3][2]=0.73;
		estab[3][3]=-1.7;
		estab[3][4]=44.5;
		estab[3][5]=0.52;
		estab[3][6]=-13;
		
		estab[4][0]=50.5;
		estab[4][1]=22.8;
		estab[4][2]=0.68;
		estab[4][3]=-1.3;
		estab[4][4]=55.4;
		estab[4][5]=0.31;
		estab[4][6]=-34;
		
		estab[5][0]=34;
		estab[5][1]=14.4;
		estab[5][2]=0.74;
		estab[5][3]=-0.4;
		estab[5][4]=62.6;
		estab[5][5]=0.18;
		estab[5][6]=-49;
	}
	public void mostrar() {
		for(int i=0;i<6;i++) {
			for (int j=0;j<7;j++) {
				System.out.print("  "+estab[i][j]);
			}
			System.out.println();
		}
	}
	public double calcular(double q,double h,double u,int i,double y2,double z2) {
		c=q/(2*u*z*y*Math.PI);
		c=c*(Math.exp(-0.5*(y2/y)));
		c=c*(Math.exp(-0.5*Math.pow((z2-h)/z, 2))+Math.exp(-0.5*Math.pow((z2+h)/z, 2)));		
		return c;
	}
	public double z(double x,int i) {
		if(x<1) {
			z=(estab[i][1]*Math.pow(x, estab[i][2]));		
			z=z+ estab[i][3];
			return z;
		}else {
			z=(estab[i][4]*Math.pow(x, estab[i][5]));		
			z=z+ estab[i][6];
			return z;
		}
	}
	public double y(double x,int i) {
		y= (estab[i][0]*Math.pow(x,b));
		return y;
	}
	
}
