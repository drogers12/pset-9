import java.util.ArrayList;

public class Exercises {

	public boolean commonEnd(ArrayList<Integer> a, ArrayList<Integer> b) {
		if (a == null || a.isEmpty() || b == null || b.isEmpty()) {
			return false;
		}
		
		if ((a.get(a.size()-1) == b.get(b.size()-1)) || (a.get(0) == b.get(0))){
			return true;
		}
		
		return false;	// default return value to ensure compilation
	}
	
	public ArrayList<String> endsMeet(ArrayList<String> values, int n) {
		// write your code here

		ArrayList<String> empty = new ArrayList<String>();
		if (values == null || values.size() < n || n <= 0) {
			return empty;
		}

		ArrayList<String> firstLast = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			firstLast.add(i, values.get(i));
		}

		int placeHolder = n;
		for (int i = n; i < 2*n; i++) {
			firstLast.add(i, values.get(values.size()-placeHolder));
			placeHolder--;
		}

		return firstLast;	// default return value to ensure compilation
	}
	
	public int difference(ArrayList<Integer> numbers) {
		// write your code here
		
		if (numbers == null || numbers.size() < 1) {
			return -1;
		} else {
			int max = numbers.get(0);
			int min = numbers.get(0);
		
			for (int i = 1; i < numbers.size(); i++) {
				if (numbers.get(i) > max) {
					max = numbers.get(i);
				}
				if (numbers.get(i) < min) {
					min = numbers.get(i);
				}
			}
			return max-min;
		}
				// default return value to ensure compilation
	}
	
	public double biggest(ArrayList<Double> numbers) {
		// write your code here
		
		if (numbers == null || numbers.size() < 3 || numbers.size() % 2 == 0) {
			return -1;
		} else {
			for(int i = 0; i < numbers.size(); i++) {
				if(numbers.get(i) < 0) {
					return -1;
				}
			}
			double first = numbers.get(0);
			double middle = numbers.get(numbers.size()/2);
			double last = numbers.get(numbers.size()-1);
			if(first > middle && first > last) {
				return first;
			} else if (middle > first && middle > last) {
				return middle;
			} else if (last > first && last > middle) {
				return last;
			} else if (first == middle && middle == last) {
				return first;
			}
		}
		return -1; //default value
	}
	
	public ArrayList<String> middle(ArrayList<String> values) {
		// write your code here
		
		ArrayList<String> empty = new ArrayList<String>();
		if (values == null || values.size() < 3 || (values.size() % 2) == 0) {
			return empty;
		}

		for (int i = 0; i < values.size(); i++) {
			if (values.get(i) == null) {
				return empty;
			}
		}

		int middle = values.size() / 2;
		int first = middle - 1;
		int last = middle + 1;

		ArrayList<String> result = new ArrayList<String>();
		result.add(values.get(first));
		result.add(values.get(middle));
		result.add(values.get(last));
		return result;
	}	


	public boolean increasing(ArrayList<Integer> numbers) {
		// write your code here
		
		if (numbers == null || numbers.size() < 3) {
			return false;
		} else {
			for (int i = 0; i < numbers.size()-2; i++) {
				if (numbers.get(i) == numbers.get(i+1)-1 && numbers.get(i+1) == numbers.get(i+2)-1) {
					return true;
				}
			}
			return false;
		}
	}
	
	public boolean everywhere(ArrayList<Integer> numbers, int x) {
		// write your code here
		if (numbers == null || numbers.size() < 1) {
			return false;
		} else {
			int correct = 0;
			for(int i = 0; i < numbers.size()-3; i++) {
				if((numbers.get(i) == x && numbers.get(i+2) == x) || (numbers.get(i) == x && numbers.get(i+3) == x)) {
					correct += 1;
				}
			}
			if(correct > 1) {
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean consecutive(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public boolean balance(ArrayList<Integer> numbers) {
		// write your code here
		
		return false;	// default return value to ensure compilation
	}
	
	public int clumps(ArrayList<String> values) {
		// write your code here
		
		return -1;		// default return value to ensure compilation
	}
}
