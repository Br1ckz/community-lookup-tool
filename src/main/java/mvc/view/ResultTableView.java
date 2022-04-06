/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.view;

import communitylookuptool.Person;
import communitylookuptool.PersonList;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import mvc.cntl.ResultTableCntl;

/**
 *
 * @author bzc5373
 */
public class ResultTableView extends javax.swing.JFrame {
    private JPanel tablePanel;
    private JPanel buttonPanel;
    private JTable personTable;
    private JButton btnDone;
    private JButton btnShowDetails;
    private JButton btnNew;
    private JScrollPane tableScroller; 
    private ResultTableCntl resultTableCntl;
    private PersonList personList;
    private Person person;
    private JButton btnBack;
    
    public ResultTableView(ResultTableCntl resultTableCntl) {
        this.resultTableCntl = resultTableCntl;
        initComponents();
    }
    public void initComponents(){
        tablePanel = new JPanel();
        buttonPanel = new JPanel(new GridLayout(1,4));
        personTable = new JTable(resultTableCntl.getResultTable());
        personTable.getColumnModel(). getColumn(0).setPreferredWidth(25);
        personTable.getColumnModel(). getColumn(1).setPreferredWidth(50);
        btnDone = new JButton("Done");
        btnDone.addActionListener(new DoneButtonListener());
        btnShowDetails = new JButton("Show Details");
        btnShowDetails.addActionListener(new DetailsButtonListener());
        btnNew = new JButton("New");
        btnNew.addActionListener(new NewButtonListener());
	btnBack = new JButton("Back");
	btnBack.addActionListener(new BackButtonListener());
        buttonPanel.add(btnBack);
	buttonPanel.add(btnNew);
        buttonPanel.add(btnShowDetails);
        buttonPanel.add(btnDone);
        tableScroller = new JScrollPane(personTable);
        personTable.setFillsViewportHeight(true);
        tableScroller.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        tableScroller.setPreferredSize(new Dimension(350,300));
        tablePanel.add(tableScroller);
        this.setSize(500, 400);
        this.setLocationRelativeTo(null);
        this.setContentPane(new JPanel(new BorderLayout()));
        this.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        this.getContentPane().add(tablePanel, BorderLayout.CENTER);
    }
    
    public class DetailsButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt){
            int selectedTableRow = personTable.getSelectedRow();
            int selectedModelRow = personTable.convertRowIndexToModel(selectedTableRow);
            if(selectedModelRow < 0) //if the user does not highlight a row, this will be -1
               selectedModelRow = 0; //set the model row to the first element in the list
            ResultTableView.this.resultTableCntl.showNewPersonUI(selectedModelRow);
        }
    }
    
    public class DoneButtonListener implements ActionListener { 
        @Override
        public void actionPerformed(ActionEvent evt) {
            System.exit(0);
        }
    }
    
    public class NewButtonListener implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent evt) {
            resultTableCntl.showNewPersonUI();
        }
    }
    
    public class BackButtonListener implements ActionListener {
        @Override 
        public void actionPerformed(ActionEvent evt) {
            resultTableCntl.moveToNav();
        }
    }
}