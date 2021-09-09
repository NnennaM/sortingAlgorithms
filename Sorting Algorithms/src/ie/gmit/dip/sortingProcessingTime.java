package ie.gmit.dip;
// Name: Nnenna Maduekwe- G00388219

// Code for the five sorting algorithms below have been adapted from www.geeksforgeeks.org/sorting-algorithms

public class sortingProcessingTime {
    static long NANO_SECONDS = 1000000;

    // Driver method to test below
    public static void main(String[] args) {
        try {
            int[] sizes = {100, 250, 500, 750, 1000, 1250, 2500, 3750, 5000, 6250, 7500, 8750, 10000}; //size of the inputs
  
            double[] bubbleValues = new double[sizes.length];
            double[] selectionValues = new double[sizes.length];
            double[] insertionValues = new double[sizes.length];
            double[] countingValues = new double[sizes.length];
            double[] mergeValues = new double[sizes.length];
            for (int s = 0; s < sizes.length; s++) {
                bubbleValues[s] = callBubbleSort(sizes[s]);
                selectionValues[s] = callSelectionSort(sizes[s]);
                insertionValues[s] = callInsertionSort(sizes[s]);
                countingValues[s] = callCountingSort(sizes[s]);
                mergeValues[s] = callMergeSort(sizes[s]);
            }
            printArrays(sizes);
            printArrays("Bubble Sort", bubbleValues);
            printArrays("Selection Sort", selectionValues);
            printArrays("Insertion Sort", insertionValues);
            printArrays("Counting Sort", countingValues);
            printArrays("Merge Sort", mergeValues);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static double callMergeSort(int size) {
        try{
            double totalAverageValue = 0;
            for (int ini = 1; ini <= 10; ini++) {
                int i = 0;
                int[] mergeArray = new int[size];
                while (i < size) {
                    mergeArray[i] = (int) (Math.random() * 100); // generate random number of input size. and store it in array of integers
                    i++;
                }
                //general method for getting the run time of the code segment
                long startTime = System.nanoTime(); // Starting Time
                sortingProcessingTime.mergeSort(mergeArray,0,mergeArray.length-1);
                long endTime = System.nanoTime();  //End Time
                long durationinNano = endTime - startTime; //getting Difference in times
                double durationinMilli = (double) durationinNano / NANO_SECONDS; //converts to milli seconds
                totalAverageValue = totalAverageValue + durationinMilli;
            }
            return Double.parseDouble(String.format("%.3f", totalAverageValue / 10)); // will get the 4 digit decimal value of average of 10 test cases
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }



    private static double callCountingSort(int size) {
        try{
            double totalAverageValue = 0;
            for (int ini = 1; ini <= 10; ini++) {
                int i = 0;
                int[] countingArray = new int[size];
                while (i < size) {
                    countingArray[i] = (int) (Math.random() * 100); // generate random number of input size. and store it in array of integers
                    i++;
                }
                //general method for getting the run time of the code segment
                long startTime = System.nanoTime(); // Starting Time
                sortingProcessingTime.countingSort(countingArray);
                long endTime = System.nanoTime();  //End Time
                long durationinNano = endTime - startTime; //getting Difference in times
                double durationinMilli = (double) durationinNano / NANO_SECONDS; //converts to milli seconds
                totalAverageValue = totalAverageValue + durationinMilli;
            }
            return Double.parseDouble(String.format("%.3f", totalAverageValue / 10)); // will get the 4 digit decimal value of average of 10 test cases
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }


    private static double callInsertionSort(int size) {
        try {
            double totalAverageValue = 0;
            for (int ini = 1; ini <= 10; ini++) {
                int i = 0;
                int[] insertionArray = new int[size];
                while (i < size) {
                    insertionArray[i] = (int) (Math.random() * 100); // generate random number of input size. and store it in array of integers
                    i++;
                }
                //general method for getting the run time of the code segment
                long startTime = System.nanoTime(); // Starting Time
                sortingProcessingTime.insertionSort(insertionArray);
                long endTime = System.nanoTime();  //End Time
                long durationinNano = endTime - startTime; //getting Difference in times
                double durationinMilli = (double) durationinNano / NANO_SECONDS; //converts to milli seconds
                totalAverageValue = totalAverageValue + durationinMilli;
            }
            return Double.parseDouble(String.format("%.3f", totalAverageValue / 10)); // will get the 4 digit decimal value of average of 10 test cases
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


    private static double callSelectionSort(int size) {
        try {
            double totalAverageValue = 0;
            for (int ini = 1; ini <= 10; ini++) {
                int i = 0;
                int[] selectionArray = new int[size];
                while (i < size) {
                    selectionArray[i] = (int) (Math.random() * 100); // generate random number of input size. and store it in array of integers
                    i++;
                }
                //general method for getting the run time of the code segment
                long startTime = System.nanoTime(); // Starting Time
                sortingProcessingTime.selectionSort(selectionArray);
                long endTime = System.nanoTime();  //End Time
                long durationinNano = endTime - startTime; //getting Difference in times
                double durationinMilli = (double) durationinNano / NANO_SECONDS; //converts to milli seconds
                totalAverageValue = totalAverageValue + durationinMilli;
            }
            return Double.parseDouble(String.format("%.3f", totalAverageValue / 10)); // will get the 3 digit decimal value of average of 10 test cases

        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static double callBubbleSort(int size) {
        try {
            double totalAverageValue = 0;
            for (int ini = 1; ini <= 10; ini++) {
                int i = 0;
                int[] bubbleArray = new int[size];
                while (i < size) {
                    bubbleArray[i] = (int) (Math.random() * 100); // generate random number of input size. and store it in array of integers
                    i++;
                }
                //general method for getting the run time of the code segment
                long startTime = System.nanoTime(); // Starting Time
                sortingProcessingTime.bubbleSort(bubbleArray);
                long endTime = System.nanoTime();  //End Time
                long durationinNano = endTime - startTime; //getting Difference in times
                double durationinMilli = (double) durationinNano / NANO_SECONDS; //converts to milli seconds
                totalAverageValue = totalAverageValue + durationinMilli;
            }
            return Double.parseDouble(String.format("%.3f", totalAverageValue / 10)); // will get the 3 digit decimal value of average of 10 test cases
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static void insertionSort(int[] arr) {
        try {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                }
                arr[j + 1] = key; // place key after the element just smaller than it
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void countingSort(int[] arr) {
        try{
            int n = arr.length;

            // The output character array that will have sorted arr
            char[] output = new char[n];

            // Create a count array to store count of inidividul
            // characters and initialize count array as 0
            int[] count = new int[256];
            for (int i = 0; i < 256; ++i)
                count[i] = 0;

            // store count of each character
            for (int j : arr) ++count[j];

            // Change count[i] so that count[i] now contains actual
            // position of this character in output array
            for (int i = 1; i <= 255; ++i)
                count[i] += count[i - 1];

            // Build the output character array
            // To make it stable we are operating in reverse order.
            for (int i = n - 1; i >= 0; i--) {
                output[count[arr[i]] - 1] = (char) arr[i];
                --count[arr[i]];
            }

            // Copy the output array to arr, so that arr now
            // contains sorted characters
            for (int i = 0; i < n; ++i)
                arr[i] = output[i];
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        // runs loop two times
        //first loop access each element of the array
        for (int i = 0; i < n - 1; i++) 
            for (int j = 0; j < n - i - 1; j++) //second loop performs the comparison in each iteration
                if (arr[j] > arr[j + 1]) { //compares the adjacent element
                    int temp = arr[j];//swapping
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    private static void selectionSort(int[] arr) {
        try {
            int n = arr.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i + 1; j < n; j++)
                    if (arr[j] < arr[min_idx])
                        min_idx = j;

                // Swap the found minimum element with the first
                // element
                int temp = arr[min_idx];
                arr[min_idx] = arr[i];
                arr[i] = temp;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void mergeSort(int[] arr,int l ,int r) {
        try{
            if (l < r) {
                // Find the middle point
                int m =l+ (r-l)/2;

                // Sort first and second halves
                mergeSort(arr, l, m);
                mergeSort(arr, m + 1, r);

                // Merge the sorted halves
                sort(arr, l, m, r);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void sort(int[] arr, int l, int m, int r) {
        try{
            int n1 = m - l + 1;
            int n2 = r - m;

            /* Create temp arrays */
            int[] L = new int[n1];
            int[] R = new int[n2];

            /*Copy data to temp arrays*/
            if (n1 >= 0) System.arraycopy(arr, l, L, 0, n1);
            for (int j = 0; j < n2; ++j)
                R[j] = arr[m + 1 + j];

            /* Merge the temp arrays */

            // Initial indexes of first and second subarrays
            int i = 0, j = 0;

            // Initial index of merged subarry array
            int k = l;
            while (i < n1 && j < n2) {
                if (L[i] <= R[j]) {
                    arr[k] = L[i];
                    i++;
                }
                else {
                    arr[k] = R[j];
                    j++;
                }
                k++;
            }

            /* Copy remaining elements of L[] if any */
            while (i < n1) {
                arr[k] = L[i];
                i++;
                k++;
            }

            /* Copy remaining elements of R[] if any */
            while (j < n2) {
                arr[k] = R[j];
                j++;
                k++;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void printArrays(String sortname, double[] arr) {
        System.out.format("%-20s", sortname); // will print the value with spacing of 20space
        for (double d : arr) {
            System.out.format("%-10s", String.format("%.3f", d));
        }
        System.out.print("\n");
    }

    private static void printArrays(int[] arr) {
        System.out.format("%-20s", "Size");// will print the value with spacing of 20space
        for (int d : arr) {
            System.out.format("%-10s", d);
        }
        System.out.print("\n");
    }

}

