package Greedy_Method;

public class PairClass {
		
		private int start, finish;
		
		public PairClass() {
			
		}

		public PairClass(int start, int finish) {
			this.start = start;
			this.finish = finish;
		}

		public int getFinish() {
			return finish;
		}

		public int getStart() {
			return start;
		}

		
		public String toString() {
			return "{" + getStart() + ", " + getFinish() + "}";
		}

}


