package equalz.imlist;

public class Cons<E> extends ImList<E> {
	private final E first;
	private final ImList<E> rest;
	public Cons (E e, ImList<E> r) {
	    super(r.size() + 1);
		first = e; 
		rest = r;
	}
} 