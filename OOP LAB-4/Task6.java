class Task6{
	public static void main(String[] args) {
		int arr[]={1,0,9,7,6,3,6,7,2};
		int n=arr.length;
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		

		for(int k=0;k<n;k++){
			int ptr=0;
			while(ptr<(n-k)-1){
				if(arr[ptr]>arr[ptr+1]){
					int temp=arr[ptr];
					arr[ptr]=arr[ptr+1];
					arr[ptr+1]=temp;
				}

				ptr++;

			}
		}

		System.out.println();
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");




	}
}