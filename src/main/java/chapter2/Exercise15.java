package chapter2;

import java.util.ArrayList;

/**
 * chapter2.Exercise15
 *
 * @author Quanyu Sha
 * @date 11/03/2020
 */
public class Exercise15 {

    /*Question:
     Fully implement the Invoice class. Provide a method that prints the invoice and a demo program that
     constructs and prints a sample invoice.
     */

    public static class Invoice {
        private ArrayList<Item> items = new ArrayList<Item>();
        private double totalCost;

        private class Item { // Item is nested inside Invoice
            String description;
            int quantity;
            double unitPrice;
            double itemCost;

            double price() {
                return quantity * unitPrice;
            }
        }

        public void addItem(String description, int quantity, double unitPrice) {
            Item newItem = new Item();
            newItem.description = description;
            newItem.quantity = quantity;
            newItem.unitPrice = unitPrice;
            newItem.itemCost = quantity * unitPrice;
            items.add(newItem);
        }

        public void printInvoice(){
            System.out.println("Invoice");
            System.out.println("=================================================");
            System.out.printf("%-10s\t%-8s\t%-11s\t%-11s\n",
                    "Description", "Quantity", "Unit Price", "Item Cost");
            System.out.println("-------------------------------------------------");
            for (int i = 0; i < items.size(); i++){
                System.out.printf("%-12s\t%-8d\t%-11.2f\t%-11.2f\n",
                        items.get(i).description,items.get(i).quantity, items.get(i).unitPrice, items.get(i).itemCost);
                totalCost += items.get(i).itemCost;
            }
            System.out.println("=================================================");
            System.out.printf("Total cost: %.2f\n", totalCost);
        }
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.addItem("Binder", 23, 19.99);
        invoice.addItem("Pencil", 34, 1.99);
        invoice.addItem("Desk", 45, 125);
        invoice.addItem("Pencil", 12, 1.99);
        invoice.printInvoice();
    }
}
