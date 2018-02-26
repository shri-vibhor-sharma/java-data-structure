package stack;

public class app {

	public static void main(String[] args) {
	
		
	//	while (!stacks.isEmpty()){
	//		System.out.println(stacks.pop());
	//	}
		String prog = "Hello";
		System.out.println(reversalProg(prog));

	}
	public static String reversalProg(String name){
		int stackSize = name.length();
		Stack theStack = new Stack(stackSize);
		String rev = "";
		for (int j=0;j<stackSize;j++){
			char ch	 =	name.charAt(j);
			theStack.push(ch);
		}
		for (int i=0;i<stackSize;i++){
			rev= rev+theStack.pop();
		}
		return rev;
	}

}
