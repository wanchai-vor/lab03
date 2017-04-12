package rmuti.lab03;

import java.util.Arrays;

public class ArraysList {

	private Object[] elementData = new Object[4];
	private int size = 4;

	public ArraysList() {
		elementData[0] = 1;
		elementData[1] = 2;
		elementData[2] = 3;
		elementData[3] = 4;
	}

	public void removeEven() {
		for (int i = 0; i < size; i++) {
										
			int data = Integer.parseInt(elementData[i].toString());
			if (data % 2 == 0) {
				remove(i);
			}
		}
	}

	public void remove(int i) {
		for (int j = i; j < size - 1; j++) {
			elementData[j] = elementData[j + 1];
		}
		elementData[size - 1] = null;
		size--;
	}

	public void add(int index, int a) {
		ensureCapacity(size + 1);
		if (index == 0) {
			for (int i = size - 1; i >= index; i--) {
				elementData[i + 1] = elementData[i];
			}
		}
		elementData[index] = a;
		size++;
	}

	public void addFirst(int f) {
		add(0, f);
	}

	public void addLast(int l) {
		add(size, l);
	}

	public void ensureCapacity(int capacity) {
		if (capacity > elementData.length) {
			int s = 2 * elementData.length;
			Object[] arr = new Object[s];
			for (int i = 0; i < size - 1; i++) {
				arr[i] = elementData[i];
			}
			elementData = arr;
		}
	}

	@Override
	public String toString() {
		return Arrays.toString(elementData);
	}

}