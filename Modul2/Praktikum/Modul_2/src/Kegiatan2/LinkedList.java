package Kegiatan2;

public class LinkedList {
        Node head;
        Node sorted;

        void add(int data){ //method add untuk menambahkan node baru di awal LinkedList
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
        }

        void Sort(Node head2){ //method sort untuk mengurutkan data di dalam LinkedList dengan memanfaatkan method sortedInsert

            sorted = null;
            Node current = head2;

            while (current != null){
                Node next = current.next;
                sortedInsert(current);
                current = next;
            }
            head = sorted;
        }

        void sortedInsert(Node newnode){ //method sortedIns untuk memasukkan node baru sesuai urutan
            if (sorted == null || sorted.data >= newnode.data){
                newnode.next = sorted;
                sorted = newnode;
            }else{
                Node current = sorted;
                while (current.next != null && current.next.data < newnode.data){
                    current = current.next;
                }
                newnode.next = current.next;
                current.next = newnode;
            }
        }

        void showData(Node head){ //menampilkan data dari setiap Node dalam LinkedList.
            while (head != null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }
    }