# Project: Structures - Linked list

## Story

In computer science, a _linked list_ is a linear collection of data elements, whose order is not given by their physical placement in memory. Instead, each element points to the next. It is a data structure consisting of a collection of nodes which together represent a sequence. In its most basic form, each node contains: _data_, and a _reference_ (in other words, a _link_) to the next node in the sequence. This structure allows for efficient insertion or removal of elements from any position in the sequence during iteration. More complex variants add additional links, allowing more efficient insertion or removal of nodes at arbitrary positions. A drawback of linked lists is that access time is linear (and difficult to pipeline). Faster access, such as random access, is not feasible. Arrays have better cache locality compared to linked lists.

On the average, a well-implemented and properly used linked list has the following time complexity characteristics:

- _get_ a value by index: `O(n)`
- _insert/remove_ value at the end: `O(1)`
- _insert/remove_ value in the middle: `search time + O(1)`

There are different alternatives of linked list:

- Singly linked list: contain nodes which have a data field as well as 'next' field, which points to the next node in line of nodes.
- Doubly linked list: In a 'doubly linked list', each node contains, besides the next-node link, a second link field pointing to the 'previous' node in the sequence.
- Multiply linked list: each node contains two or more link fields, each field being used to connect the same set of data records in a different order of same set(e.g., by name, by department, by date of birth, etc.).
- Circular linked list: the last pointer points to the first node. In the case of a circular doubly linked list, the first node also points to the last node of the list.
