/*
 Faiz Momin
 May 8, 2019
 This is my sorting efficiencies project that tests and compares various sorting methods.
 */
package mominsortingefficiencies;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

/**
 *
 * @author faizmomin
 */
public class graphicalUserInterface extends javax.swing.JFrame {

    //Creates the variables for the counters to keep track of the number of loops for each sort type
    static int counter1 = 0, counter2 = 0, counter3 = 0, counter4 = 0;

    /**
     * This method creates the GUI and calls the button group method.
     */
    public graphicalUserInterface() {
        initComponents();
        groupButton();
    }

    /**
     * This method makes two button groups so that only one button in each group
     * can be selected at any given time.
     */
    private void groupButton() {

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(hunderedNumbersButton);
        bg1.add(tenNumbersButton);
        bg1.add(thousandNumbersButton);
        bg1.add(fiveThousandNumbersButton);

        ButtonGroup bg2 = new ButtonGroup();
        bg2.add(ascendingButton);
        bg2.add(descendingButton);

    }

    /**
     * This method is the descending selection sort.
     *
     * @param a, the array to be sorted.
     * @return the sorted array.
     */
    public static int[] descendingSelectionSort(int[] a) {
        //Creates a temp variable which will temporarily hold one of the values that is being switched.
        int temp;
        //Loops through a.length (number of elements in array a) times.
        for (int i = 0; i < a.length - 1; i++) {
            //Loops through the rest of the array and finds the biggest number and swaps it with the i'th position.
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                //Counter is incremented by 1.
                counter1++;
            }
        }
        //Return the sorted array.
        return a;
    }

    /**
     * This method is the ascending selection sort.
     *
     * @param a, the array to be sorted.
     * @return the sorted array.
     */
    public static int[] ascendingSelectionSort(int[] a) {
        //Creates a temp variable which will temporarily hold one of the values that is being switched.
        int temp;
        //Loops through a.length (number of elements in array a) times.
        for (int i = 0; i < a.length - 1; i++) {
            //Loops through the rest of the array and finds the smallest number and swaps it with the i'th position.
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                //Counter is incremented by 1.
                counter1++;
            }
        }
        //Return the sorted array.
        return a;
    }

    /**
     * This method is the descending selection sort.
     *
     * @param a, the array to be sorted.
     * @return the sorted array
     */
    public static int[] descendingInsertionSort(int[] a) {
        //Creates a temp variable which will temporarily hold the number being slotted into the sorted section.
        int temp;
        //Creates a variable that will hold the index of the number that the the current number is being compared to.
        int j;

        //Loops through a.length (number of elements in array a) times.
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;

            //Moves numbers that are less than the temp one element higher.
            while (j >= 0 && a[j] < temp) {
                a[j + 1] = a[j];
                j--;
                //Increments counter by 1.
                counter2++;
            }

            //Places the temp in the correct spot of the sorted section of the array.
            a[j + 1] = temp;
        }

        //Returns the sorted array.
        return a;
    }

    /**
     * This method is the ascending selection sort.
     *
     * @param a, the array to be sorted.
     * @return the sorted array
     */
    public static int[] ascendingInsertionSort(int[] a) {
        //Creates a temp variable which will temporarily hold the number being slotted into the sorted section.
        int temp;
        //Creates a variable that will hold the index of the number that the the current number is being compared to.
        int j;

        //Loops through a.length (number of elements in array a) times.
        for (int i = 1; i < a.length; i++) {
            temp = a[i];
            j = i - 1;

            //Moves numbers that are less than the temp one element higher.
            while (j >= 0 && a[j] > temp) {
                a[j + 1] = a[j];
                j--;
                //Increments counter by 1.
                counter2++;
            }

            //Places the temp in the correct spot of the sorted section of the array.
            a[j + 1] = temp;
        }

        //Returns the sorted array.
        return a;
    }

    /**
     * This method is the descending bubble sort.
     *
     * @param a, the array to be sorted.
     * @return the sorted array.
     */
    public static int[] descendingBubbleSort(int[] a) {
        //This variable holds the index of the array that needs to be searched until.
        int bottom = a.length - 1;
        //Boolean that is used to check if a switch has occured.
        boolean sw = true;
        //Creates a temp variable that will temporarily hold one of the number that is being switched.
        int temp;
        //Loop runs while sw is true.
        while (sw) {
            //sets sw false.
            sw = false;
            //Loops through the array and swaps adjacent elements if they are in an incorrect order and sets sw to true if a swtich has occured.
            for (int i = 0; i < bottom; i++) {
                if (a[i] < a[i + 1]) {
                    sw = true;
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                //Increments counter by 1.
                counter3++;
            }
            //Decreases bottom by one since the last element being looked at will be in the correct spot and doesn't need to be check again.

            bottom--;
        }
        //Return the sorted array.
        return a;
    }

    public static int[] ascendingBubbleSort(int[] a) {
        //This variable holds the index of the array that needs to be searched until.
        int bottom = a.length - 1;
        //Boolean that is used to check if a switch has occured.
        boolean sw = true;
        //Creates a temp variable that will temporarily hold one of the number that is being switched.
        int temp;
        //Loop runs while sw is true.
        while (sw) {
            //sets sw false.
            sw = false;
            //Loops through the array and swaps adjacent elements if they are in an incorrect order and sets sw to true if a swtich has occured.
            for (int i = 0; i < bottom; i++) {
                if (a[i] > a[i + 1]) {
                    sw = true;
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
                //Increments counter by 1.
                counter3++;
            }
            //Decreases bottom by one since the last element being looked at will be in the correct spot and doesn't need to be check again.
            bottom--;
        }
        //Return the sorted array.
        return a;
    }

    /**
     * This method is the descending quik sort.
     *
     * @param a, the array to be sorted.
     * @param left, the left index of the array.
     * @param right, the right index of the array.
     */
    public static void descendingQuikSort(int[] a, int left, int right) {
        //If the entire array as been checked and sorted, stop the recursion.
        if (left >= right) {
            return;
        }

        //Creates the variables that hold the left and right index of the segment that is to be modified
        int i = left;
        int j = right;
        //Calulate the new pivot point
        int pivot = a[(left + right) / 2];

        //Loops while the left (i) is less than the right (j)
        while (i < j) {
            //If the current number is greater than the middle, i is incremented by 1.
            while (a[i] > pivot) {
                i++;
                counter4++;
            }
            //If the current number is less than the middle, j is subtracted by 1.
            while (pivot > a[j]) {
                j--;
                counter4++;
            }

            //If i is less than or equal to j, the swap is made.
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }

        //The method calls itself again, making it recursive.
        descendingQuikSort(a, left, j);
        descendingQuikSort(a, i, right);
    }

    public static void ascendingQuikSort(int[] a, int left, int right) {
        //If the entire array as been checked and sorted, stop the recursion.
        if (left >= right) {
            return;
        }
        //Creates the variables that hold the left and right index of the segment that is to be modified

        int i = left;
        int j = right;
        //Calulate the new pivot point
        int pivot = a[(left + right) / 2];

        //Loops while the left (i) is less than the right (j)
        while (i < j) {
            //If the current number is less than the middle, i is incremented by 1.
            while (a[i] < pivot) {
                i++;
                counter4++;
            }
            //If the current number is greater than the middle, j is subtracted by 1.
            while (pivot < a[j]) {
                j--;
                counter4++;
            }

            //If i is less than or equal to j, the swap is made.
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }

        }
        //The method calls itself again, making it recursive.
        ascendingQuikSort(a, left, j);
        ascendingQuikSort(a, i, right);
    }

    /**
     * This method generates an array of random numbers between -10000 and 10000 inclusive.
     * @param n, size of the array.
     * @return the array of random numbers. 
     */
    public static int[] randomNumArray(int n) {
        //Create the array.
        int[] rand = new int[n];
        //Fill the array with random numbers.
        for (int i = 0; i < n; i++) {
            rand[i] = (int) (Math.random() * 20002 - 10001);
        }
        //Return the array.
        return rand;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tenNumbersButton = new javax.swing.JRadioButton();
        hunderedNumbersButton = new javax.swing.JRadioButton();
        thousandNumbersButton = new javax.swing.JRadioButton();
        fiveThousandNumbersButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        displaySortType = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        ascendingButton = new javax.swing.JRadioButton();
        descendingButton = new javax.swing.JRadioButton();
        sortButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        originalNumbersBox = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedNumbersBox = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultsBox = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Sorting Algorithms");

        jLabel2.setText("Amount of Numbers to sort: ");

        tenNumbersButton.setSelected(true);
        tenNumbersButton.setText("10");
        tenNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenNumbersButtonActionPerformed(evt);
            }
        });

        hunderedNumbersButton.setText("100");
        hunderedNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hunderedNumbersButtonActionPerformed(evt);
            }
        });

        thousandNumbersButton.setText("1000");
        thousandNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thousandNumbersButtonActionPerformed(evt);
            }
        });

        fiveThousandNumbersButton.setText("5000");
        fiveThousandNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveThousandNumbersButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Display numbers sorted by: ");

        displaySortType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Insertion Sort", "Bubble Sort", "Quik Sort" }));
        displaySortType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySortTypeActionPerformed(evt);
            }
        });

        jLabel4.setText("Sort order: ");

        ascendingButton.setSelected(true);
        ascendingButton.setText("Ascending");
        ascendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendingButtonActionPerformed(evt);
            }
        });

        descendingButton.setText("Descending");
        descendingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendingButtonActionPerformed(evt);
            }
        });

        sortButton.setText("Sort");
        sortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Original Numbers: ");

        jLabel6.setText("Sorted Numbers:");

        jLabel7.setText("Sort Results");

        originalNumbersBox.setColumns(20);
        originalNumbersBox.setRows(5);
        jScrollPane1.setViewportView(originalNumbersBox);

        sortedNumbersBox.setColumns(20);
        sortedNumbersBox.setRows(5);
        jScrollPane2.setViewportView(sortedNumbersBox);

        resultsBox.setColumns(20);
        resultsBox.setRows(5);
        jScrollPane3.setViewportView(resultsBox);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displaySortType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tenNumbersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hunderedNumbersButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(thousandNumbersButton)
                        .addGap(9, 9, 9)
                        .addComponent(fiveThousandNumbersButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(117, 117, 117)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descendingButton)
                                            .addComponent(ascendingButton)))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tenNumbersButton)
                            .addComponent(hunderedNumbersButton)
                            .addComponent(thousandNumbersButton)
                            .addComponent(fiveThousandNumbersButton))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(displaySortType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ascendingButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descendingButton))
                            .addComponent(sortButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addComponent(jScrollPane3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tenNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenNumbersButtonActionPerformed

    }//GEN-LAST:event_tenNumbersButtonActionPerformed

    private void hunderedNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hunderedNumbersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hunderedNumbersButtonActionPerformed

    private void thousandNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thousandNumbersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_thousandNumbersButtonActionPerformed

    private void fiveThousandNumbersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveThousandNumbersButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fiveThousandNumbersButtonActionPerformed

    private void displaySortTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySortTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_displaySortTypeActionPerformed

    private void ascendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ascendingButtonActionPerformed

    private void descendingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendingButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descendingButtonActionPerformed

    /**
     * This method runs when the sort button is clicked.
     * @param evt 
     */
    private void sortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortButtonActionPerformed
        //Reset all the counters to 0.
        counter1 = 0;
        counter2 = 0;
        counter3 = 0;
        counter4 = 0;

        //Create the variables that determine if a radio button is selected or not.
        boolean as = ascendingButton.isSelected();
        boolean ten = tenNumbersButton.isSelected();
        boolean hundred = hunderedNumbersButton.isSelected();
        boolean thousand = thousandNumbersButton.isSelected();
        boolean fiveThousand = fiveThousandNumbersButton.isSelected();
        
        //Reads the sort type that is to be displayed
        String sortType = (String) displaySortType.getSelectedItem();
        
        //Creates the variables that will be used to time the sorting methods.
        long selectionT = 0, insertionT = 0, bubbleT = 0, quikT = 0, start = 0, stop = 0;
        
        //Variable that will hold the size of the random numbers array.
        int n;

        //Determines the size of the array based on the button selected.
        if (ten) {
            n = 10;
        } else if (hundred) {
            n = 100;
        } else if (thousand) {
            n = 1000;
        } else {
            n = 5000;
        }

        //Creates the array and copies it to the other arrays so that they all have the same numbers.
        int[] selectionSort = randomNumArray(n);
        int[] insertionSort = selectionSort.clone();
        int[] bubbleSort = selectionSort.clone();
        int[] quikSort = selectionSort.clone();

        //Creates the string variables that will be used to display the outputs.
        String originalNums = "";
        String sortedNums = "";
        
        //Creats a string of the original, unsorted numbers.
        for (int i = 0; i < n; i++) {
            originalNums += selectionSort[i] + "\n";
        }

        //Displays the unsorted array of numbers in the text field.
        originalNumbersBox.setText(originalNums);

        //Checks to see if the ascending button or descending button is selected and runs the respective methods.
        if (as) {
            //Starts the timer, runs the sorting method and stops the timer. 
            start = System.currentTimeMillis();
            selectionSort = ascendingSelectionSort(selectionSort);
            stop = System.currentTimeMillis();
            //Calculates the time taken to sort the array.
            selectionT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            insertionSort = ascendingInsertionSort(insertionSort);
            stop = System.currentTimeMillis();
            insertionT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            bubbleSort = ascendingBubbleSort(bubbleSort);
            stop = System.currentTimeMillis();
            bubbleT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            ascendingQuikSort(quikSort, 0, n - 1);
            stop = System.currentTimeMillis();
            quikT = stop - start;
        } else {
            //Same as above.
            start = System.currentTimeMillis();
            selectionSort = descendingSelectionSort(selectionSort);
            stop = System.currentTimeMillis();
            selectionT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            insertionSort = ascendingInsertionSort(insertionSort);
            insertionSort = descendingInsertionSort(insertionSort);
            stop = System.currentTimeMillis();
            insertionT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            bubbleSort = descendingBubbleSort(bubbleSort);
            stop = System.currentTimeMillis();
            bubbleT = stop - start;

            //Same as above.
            start = System.currentTimeMillis();
            descendingQuikSort(quikSort, 0, n - 1);
            stop = System.currentTimeMillis();
            quikT = stop - start;

        }

        //Creates the sorted  string based on the sort that was selected. They will all do the same thing as all lists will be sorted in the same order.
        if (sortType.equals("Selection Sort")) {
            for (int i = 0; i < n; i++) {
                sortedNums += selectionSort[i] + "\n";
            }
        } else if (sortType.equals("Insertion Sort")) {
            for (int i = 0; i < n; i++) {
                sortedNums += insertionSort[i] + "\n";
            }
        } else if (sortType.equals("Bubble Sort")) {
            for (int i = 0; i < n; i++) {
                sortedNums += bubbleSort[i] + "\n";
            }
        } else {
            for (int i = 0; i < n; i++) {
                sortedNums += quikSort[i] + "\n";
            }
        }

        //Creates the output string based on the counter and timers calculated.
        String output = "Selection Sort\nNumber of times a loop was executed: " + counter1 + "\nNumber of milliseconds to complete sort: " + selectionT + "\n\nInsertion Sort\nNumber of times a loop was executed: " + counter2 + "\nNumber of milliseconds to complete sort: " + insertionT + "\n\nBubble Sort\nNumber of times a loop was executed: " + counter3 + "\nNumber of milliseconds to complete sort: " + bubbleT + "\n\nQuik Sort\nNumber of times a loop was executed: " + counter4 + "\nNumber of milliseconds to complete sort: " + quikT;
        
        //Updates the sorted numbers box and results box with the outputs.
        resultsBox.setText(output);
        sortedNumbersBox.setText(sortedNums);

    }//GEN-LAST:event_sortButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(graphicalUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(graphicalUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(graphicalUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(graphicalUserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new graphicalUserInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascendingButton;
    private javax.swing.JRadioButton descendingButton;
    private javax.swing.JComboBox<String> displaySortType;
    private javax.swing.JRadioButton fiveThousandNumbersButton;
    private javax.swing.JRadioButton hunderedNumbersButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea originalNumbersBox;
    private javax.swing.JTextArea resultsBox;
    private javax.swing.JButton sortButton;
    private javax.swing.JTextArea sortedNumbersBox;
    private javax.swing.JRadioButton tenNumbersButton;
    private javax.swing.JRadioButton thousandNumbersButton;
    // End of variables declaration//GEN-END:variables
}
