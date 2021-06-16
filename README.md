# algorithm-programs-java

1. Write static functions to return all permutations of a String using iterative method and
   Recursion method. Check if the arrays returned by two string functions are equal.
   

2. Binary Search the Word from Word List
   
   a. Desc ->Read in a list of words from File. Then prompt the user to enter a word to
   search the list. The program reports if the search word is found in the list.
   
   b. I/P -> read in the list words comma separated from a File and then enter the word
   to be searched
   
   c. Logic -> Use Arrays to sort the word list and then do the binary search
   
   d. O/P -> Print the result if the word is found or not
   

3. Insertion Sort
   a. Desc -> Reads in strings and prints them in sorted order using insertion sort.
   
   b. I/P -> read in the list words
   
   c. Logic -> Use Insertion Sort to sort the words in the String array
   
   d. O/P -> Print the Sorted List
   

4. Bubble Sort
   a. Desc -> Reads in integers prints them in sorted order using Bubble Sort
   
   b. I/P -> read in the list ints
   
   c. O/P -> Print the Sorted List


5. Merge Sort - Write a program to do Merge Sort of list of Strings.
   
   a. Logic -> To Merge Sort an array, we divide it into two halves, sort the two halves
   independently, and then merge the results to sort the full array. To sort a[lo, hi),
   we use the following recursive strategy:
   
   b. Base case: If the sub-array length is 0 or 1, it is already sorted.
   
   c. Reduction step: Otherwise, compute mid = lo + (hi - lo) / 2, recursively sort the
   two sub-arrays a(lo, mid) and a(mid, hi), and merge them to produce a sorted result.


6. An Anagram Detection Example
   
   a. Desc -> One string is an anagram of another if the second is simply a
   rearrangement of the first. For example, 'heart' and 'earth' are anagrams...
   
   b. I/P -> Take 2 Strings as Input such abcd and dcba and Check for Anagrams
   
   c. O/P -> The Two Strings are Anagram or not....


7. Take a range of 0 - 1000 Numbers and find the Prime numbers in that range.


10. Question to find your number
    
    a. Desc -> takes a command-line argument N, asks you to think of a number
    between 0 and N-1, where N = 2^n, and always guesses the answer with n
    questions.
    
    b. I/P -> the Number N and then recursively ask true/false if the number is between
    a high and low value
    
    c. Logic -> Use Binary Search to find the number
    
    d. O/P -> Print the intermediary number, and the final answer