package Genericprac.Genericprac;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter

public class CustomList<E> {

	static Object a[] = new Object[10];
	Object aa[] = new Object[10];
	Object aaa[] = new Object[10];
	int i = 1;

	public CustomList(int length) {

	}

	public Object add(E e) {

		a[i++] = new Object();
		return a[i] = e;

	}

	public Object addall(Object[] e) {
		aa = e;
		return aa;

	}

	public Object delete(E e) {

		int flag = 0, j = 0, h = 0;
		for (j = 0; j < i; j++) {
			if (aa[j].equals(e))
				break;
		}

		for (h = 0; h < i; h++) {
			aaa[flag] = new Object();
			if (h >= j) {
				aaa[flag++] = aa[h + 1];

			} else {
				aaa[flag++] = aa[h];

			}

		}

		return aaa;
	}

	public Object Update(E e, int ii) {
		int flag = 0;
		for (int h = 0; h < i; h++) {
			aaa[flag] = new Object();
			if (h == ii) {
				aaa[flag++] = e;

			} else {
				aaa[flag++] = aa[h];

			}

		}
		return aaa;

	}

	public E search(int i, int j, E a) {

		return a;
	}

	@Override
	public String toString() {
		return "CustomList [a=" + Arrays.toString(a) + "]";
	}

}
