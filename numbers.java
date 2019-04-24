/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developertest;

import javax.swing.JOptionPane;

/**
 *
 * @author Free Ze Goat
 */
class numbers {

    public static void main(String[] args) {
        int[] Numbers;
        Numbers = new int[10];
        Numbers[0] = Integer.parseInt(JOptionPane.showInputDialog("Please enter first number"));
        if ((Numbers[0]) > 9) {
            System.exit(0);
        } else {
            Numbers[1] = Integer.parseInt(JOptionPane.showInputDialog("Please enter second number"));
            if ((Numbers[0]) > 9) {
                System.exit(0);
            } else {
                Numbers[2] = Integer.parseInt(JOptionPane.showInputDialog("Please enter third number"));
                if ((Numbers[0]) > 9) {
                    System.exit(0);
                } else {
                    Numbers[3] = Integer.parseInt(JOptionPane.showInputDialog("Please enter fourth number"));
                    if ((Numbers[0]) > 9) {
                        System.exit(0);
                    } else {
                        Numbers[4] = Integer.parseInt(JOptionPane.showInputDialog("Please enter fifth number"));
                        if ((Numbers[0]) > 9) {
                            System.exit(0);
                        } else {
                            Numbers[5] = Integer.parseInt(JOptionPane.showInputDialog("Please enter sixth number"));
                            if ((Numbers[0]) > 9) {
                                System.exit(0);
                            } else {
                                Numbers[6] = Integer.parseInt(JOptionPane.showInputDialog("Please enter seventh number"));
                                if ((Numbers[0]) > 9) {
                                    System.exit(0);
                                } else {
                                    Numbers[7] = Integer.parseInt(JOptionPane.showInputDialog("Please enter eight number"));
                                    if ((Numbers[0]) > 9) {
                                        System.exit(0);
                                    } else {
                                        Numbers[8] = Integer.parseInt(JOptionPane.showInputDialog("Please enter ninth number"));
                                        if ((Numbers[0]) > 9) {
                                            System.exit(0);
                                        } else {
                                            Numbers[9] = Integer.parseInt(JOptionPane.showInputDialog("Please enter tenth number"));
                                            if ((Numbers[0]) > 9) {
                                                System.exit(0);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(Numbers[i]);
        }
        for (int j = 4; j <= 6; j++) {
            System.out.print(" " + Numbers[j]);
        }
        for (int k = 7; k <= 9; k++) {
            System.out.print(" " + Numbers[k]);
        }
        System.out.println();
    }
}
