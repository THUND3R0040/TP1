public class CustomArrayList {
    private Object[] elements;
    private int size;

    public CustomArrayList() {
        this(10);
    }

    public CustomArrayList(int initialSize) {
        elements = new Object[initialSize];
        size = 0;
    }

    public void add(Object obj) {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, 0, newElements, 0, size);
            elements = newElements;
        }
        elements[size++] = obj;
    }

    public void add(int index, Object x) {
        if (index >= 0 && index <= size) {
            if (size == elements.length) {
                Object[] newElements = new Object[elements.length * 2];
                System.arraycopy(elements, 0, newElements, 0, size);
                elements = newElements;
            }
            System.arraycopy(elements, index, elements, index + 1, size - index);
            elements[index] = x;
            size++;
        }
    }

    public Object get(int index) {
        if (index >= 0 && index < size) {
            return elements[index];
        }
        return null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isIn(Object x) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public int find(Object x) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }

    public void remove(Object x) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(x)) {
                System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                size--;
                break;
            }
        }
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add("Hello");
        list.add("World");
        list.add("!");
        list.add(1, "Java");
        list.remove("!");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

} 
