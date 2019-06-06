package code.challenges.linkedlist;

import org.junit.Test;
import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void test_empty_list() {
        LinkedList testList = new LinkedList();
        assertEquals("empty linked list should have null head", null, testList.head);
    }

    @Test
    public void test_insert_adds_to_head() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        assertEquals("empty linked list should have null head", 5, testList.head.value);
    }

    @Test
    public void test_insert_adds_to_head_after_multiple_adds() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertEquals("empty linked list should have null head", 10, testList.head.value);
    }

    @Test
    public void test_includes_returns_true() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertTrue(testList.includes(10));
        assertTrue(testList.includes(5));
    }

    @Test
    public void test_includes_returns_false() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertFalse(testList.includes(15));
        assertFalse(testList.includes(0));
    }

    @Test
    public void test_empty_ll_includes_returns_false() {
        LinkedList testList = new LinkedList();
        assertFalse(testList.includes(5));
    }

    @Test
    public void test_print() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 5, 5, 5)), testList.print());
    }

    @Test
    public void append() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.append(10);
        assertEquals("next node from head should be inserted node", 10, testList.head.next.value);
    }

    @Test
    public void insertBefore() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insertBefore(5, 7);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 7, 5)), testList.print());
    }

    @Test
    public void insertAfter() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insertAfter(5, 7);
        assertEquals("should output array as string", new ArrayList<Integer>(Arrays.asList(10, 5, 7)), testList.print());
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertAfter_empty_list() {
        LinkedList testList = new LinkedList();
        testList.insertAfter(5,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertBefore_empty_list() {
        LinkedList testList = new LinkedList();
        testList.insertBefore(5,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertAfter_value_not_included() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(5);
        testList.insert(5);
        testList.insert(10);
        testList.insertAfter(7,3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void insertBefore_value_not_included() {
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(5);
        testList.insert(10);
        testList.insertBefore(22, 7);
    }

    @Test
    public void test_kth_from_end(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(5);
        testList.insert(10);
        int testVal = testList.kthFromEnd(2);
        assertEquals("Should return 5", 5, testVal);
    }

    @Test
    public void test_kth_from_end_single_value(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        int testVal = testList.kthFromEnd(0);
        assertEquals("Should return 5", 5, testVal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kth_from_end_k_is_listLength(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(5);
        testList.insert(10);
        int testVal = testList.kthFromEnd(4);
    }

    @Test
    public void test_kth_from_end2(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(15);
        testList.insert(20);
        int testVal = testList.kthFromEnd(3);
        assertEquals("Should return 15", 20, testVal);
    }

    @Test
    public void test_kth_from_end_k_of_zero(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(15);
        testList.insert(20);
        int testVal = testList.kthFromEnd(0);
        assertEquals("Should return 5", 5, testVal);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kth_from_end_negativre_k(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        testList.insert(5);
        testList.insert(10);
        int testVal = testList.kthFromEnd(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kth_from_end_short_list(){
        LinkedList testList = new LinkedList();
        testList.insert(5);
        testList.insert(10);
        int testVal = testList.kthFromEnd(4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_kth_from_end_empty_list(){
        LinkedList testList = new LinkedList();
        int testVal = testList.kthFromEnd(0);
    }

    @Test
    public void test_ll_merge(){
        LinkedList testList = new LinkedList();
        testList.insert(7);
        testList.insert(5);
        testList.insert(3);
        testList.insert(1);
        LinkedList otherList = new LinkedList();
        otherList.insert(8);
        otherList.insert(6);
        otherList.insert(4);
        otherList.insert(2);
        LinkedList output = LinkedList.mergeLists(testList, otherList);
        assertEquals("Output list should be 1,2,3,4,5,6,7,8", "[1, 2, 3, 4, 5, 6, 7, 8]", output.toString());
    }

    @Test
    public void test_ll_merge_uneven_list1(){
        LinkedList testList = new LinkedList();
        testList.insert(1);
        LinkedList otherList = new LinkedList();
        otherList.insert(5);
        otherList.insert(4);
        otherList.insert(3);
        otherList.insert(2);
        LinkedList output = LinkedList.mergeLists(testList, otherList);
        assertEquals("Output list should be 1,2,3,4,5", "[1, 2, 3, 4, 5]", output.toString());
    }

    @Test
    public void test_ll_merge_use_case(){
        LinkedList testList = new LinkedList();
        testList.insert(2);
        testList.insert(3);
        testList.insert(1);
        LinkedList otherList = new LinkedList();
        otherList.insert(4);
        otherList.insert(9);
        otherList.insert(5);
        LinkedList output = LinkedList.mergeLists(testList, otherList);
        assertEquals("Output list should be 1, 5, 3, 9, 2, 4", "[1, 5, 3, 9, 2, 4]", output.toString());
    }

    @Test
    public void test_ll_merge_uneven_list(){
        LinkedList testList = new LinkedList();
        testList.insert(3);
        testList.insert(1);
        LinkedList otherList = new LinkedList();
        otherList.insert(4);
        otherList.insert(9);
        otherList.insert(5);
        LinkedList output = LinkedList.mergeLists(testList, otherList);
        assertEquals("Output list should be 1, 5, 3, 9, 4", "[1, 5, 3, 9, 4]", output.toString());
    }

    @Test
    public void test_ll_merge_uneven_list2(){
        LinkedList testList = new LinkedList();
        testList.insert(2);
        testList.insert(3);
        testList.insert(1);
        LinkedList otherList = new LinkedList();
        otherList.insert(9);
        otherList.insert(5);
        LinkedList output = LinkedList.mergeLists(testList, otherList);
        assertEquals("Output list should be 1, 5, 3, 9, 2", "[1, 5, 3, 9, 2]", output.toString());
    }


}
