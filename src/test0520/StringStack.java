package test0520;

interface Stack {
	   int length();
	   int capacity(); 
	   String pop();
	   boolean push(String val); 
	}

	class StringStack implements Stack{
	private int num; 
	   private int set;
	   private String[] stack;
	   public StringStack(int num) {
	      this.num = num;
	      this.set = 0;
	      stack = new String[num];
	   }
	   public int length() {
	      return set;
	   }
	   public int capacity() {
	      return stack.length;
	   }
	   public String pop() {
	      if(set-1 < 0) 
	         return null;
	      set--; 
	      String s = stack[set]; 
	      return s;
	   }
	   public boolean push(String val) {
	      if(set < num) {
	         stack[set] = val; 
	         set++; 
	         return true;
	      }
	      else
	         return false;
	   }
}
