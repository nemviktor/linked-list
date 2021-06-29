package com.codecool.linkedlist;

public class SinglyLinkedList<T> {

    private class Link<T> {

        private T value;
        private Link next;

        Link(T value) {
            this.value = value;
        }

        T getValue() {
            return value;
        }

        Link getNext() {
            return next;
        }

        void setNext(Link next) {
            this.next = next;
        }
    }

    private Link head;

    public SinglyLinkedList() {
    }


    /**
     * Add a new element to the list.
     * The new element is appended to the current last item.
     *
     * @param value value to be appended
     */
    public void add(T value) {

        if (head == null) {
            head = new Link(value);
            return;
        }

        Link current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }

        current.setNext(new Link(value));
    }

    /**
     * Get a value based on its index.
     *
     * @param index the position of requested value
     * @return value of element at index
     */
    public T get(int index) {
        int actualSize = size();
        if (index > actualSize || index < 0) {
            throw new IndexOutOfBoundsException("Index is out of bounds!");
        } else {
            int i = 0;
            Link current = head;
            while (i != index) {
                current = current.getNext();
                i++;
            }
            return (T) current.getValue();
        }
    }

    /**
     * Returns the zero-based index of the first occurrence of a value in the list.
     *
     * @param number value to be searched
     * @return Index of 'number' if it's in the list, otherwise -1;
     */
    public int indexOf(T number) {
        Link current = head;
        if (head.getValue() == number) {
            return 0;
        }

        int indexOf = 0;
        while (current.getNext() != null) {
            current = current.getNext();
            indexOf++;
            if (current.getValue().equals(number)) {
                return indexOf;
            }
        }
        return -1;
    }

    /**
     * Inserts a value at an index into the array shifting elements if necessary.
     *
     * @param index  Position of the new element
     * @param number Value to be inserted.
     */
    public void insert(int index, T number) {
        Link linkToInsert = new Link(number);

        if (index == 0) {
            linkToInsert.setNext(head);
            head = linkToInsert;
        } else {
            int actualSize = size();
            if (index < actualSize && index > 0) {
                int i = 1;
                Link elementBeforeIndex = head;
                while (i != index) {
                    elementBeforeIndex = elementBeforeIndex.getNext();
                    i++;
                }
                Link oldElementAtIndex = elementBeforeIndex.getNext();
                elementBeforeIndex.setNext(new Link(number));
                elementBeforeIndex.getNext().setNext(oldElementAtIndex);
            } else if(index == actualSize) {
                add(number);
            } else {
                    throw new IndexOutOfBoundsException();
            }
        }
    }

    /**
     * Returns with the amount of inserted nodes.
     *
     * @return Size of list.
     */
    public int size() {
        if (head == null) {
            return 0;
        } else {
            int i = 1;
            Link current = head;
            while (current.getNext() != null) {
                i++;
                current = current.getNext();
            }
            return i;
        }
    }


    /**
     * Removes the element at 'index' from the array.
     *
     * @param index Position of value to be deleted.
     */
    public void remove(int index) {
        if (index == 0) {
            if (head == null) {
                throw new IndexOutOfBoundsException();
            } else {
                head = head.getNext();
            }
            return;
        }
        Link elementBeforeIndex = head;
        while (index - 1 > 0) {
            elementBeforeIndex = elementBeforeIndex.getNext();
            index--;
            if (elementBeforeIndex == null) {
                throw new IndexOutOfBoundsException();
            }
        }
        Link elementAtIndex = elementBeforeIndex.getNext();
        if (elementAtIndex == null) {
            throw new IndexOutOfBoundsException();
        }
        elementBeforeIndex.setNext(elementAtIndex.getNext());
    }
}
