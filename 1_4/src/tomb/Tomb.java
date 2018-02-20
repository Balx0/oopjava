package tomb;




public class Tomb {


	public static void main(String[] args) {
		int[] tomb = new int[10];
		int k;
		int maxi=0;
		int mini=tomb.length;
		for(int i=0;i<tomb.length;i++){
			tomb[i] = i+1;
			System.out.println("Az " + i + ". elem: "  + tomb[i]);
		}
		
		for(int c=0;c < tomb.length; c++){
			if(tomb[c] > tomb[maxi]){
				maxi=c;
			}
		}System.out.println("A legnagyobb elem indexe:" +maxi);
		
		System.out.println("A legnagyobb elem:" +tomb[maxi]);
		
		
		for(int c=0;c < tomb.length; c++){
			if(tomb[c] < tomb[maxi]){
				maxi=c;
			}
		}System.out.println("A legkisebb elem indexe:" +maxi);
		
		System.out.println("A legkisebb elem:" +tomb[maxi]);

		
		
	}

}
