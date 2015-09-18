/*
 * Cal.java
 *
 * Created on __DATE__, __TIME__
 */

package com.qilu.homework;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JOptionPane;

public class Cal extends javax.swing.JWindow {

	public Cal() {
		initComponents();
	}

	private void initComponents() {
		java.awt.GridBagConstraints gridBagConstraints;

//		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
//		setTitle("\u8ba1\u7b97\u5668");
		setBounds(new java.awt.Rectangle(500, 50, 0, 0));
//		setResizable(false);

		displayStand = new javax.swing.JPanel();
		keyBoardChange = new javax.swing.JToggleButton();
		editStand = new javax.swing.JTextField();
		formulaStand = new javax.swing.JTextField();
		keyBoard = new javax.swing.JPanel();
		jBt1 = new javax.swing.JButton();
		jBt2 = new javax.swing.JButton();
		jBt3 = new javax.swing.JButton();
		jBt4 = new javax.swing.JButton();
		jBt5 = new javax.swing.JButton();
		jBt6 = new javax.swing.JButton();
		jBt7 = new javax.swing.JButton();
		jBt8 = new javax.swing.JButton();
		jBt9 = new javax.swing.JButton();
		jBt0 = new javax.swing.JButton();
		jBtPoint = new javax.swing.JButton();
		jBtEquals = new javax.swing.JButton();
		jBtAdd = new javax.swing.JButton();
		jBtSub = new javax.swing.JButton();
		jBtMul = new javax.swing.JButton();
		jBtDiv = new javax.swing.JButton();
		jBtBack = new javax.swing.JButton();
		jBtClean = new javax.swing.JButton();
		scienceKeyBoard = new javax.swing.JPanel();
		jBtS1 = new javax.swing.JButton();
		jBtS2 = new javax.swing.JButton();
		jBtS3 = new javax.swing.JButton();
		jBtS4 = new javax.swing.JButton();
		jBtS5 = new javax.swing.JButton();
		jBtS6 = new javax.swing.JButton();
		jBtS7 = new javax.swing.JButton();
		jBtS8 = new javax.swing.JButton();
		jBtS9 = new javax.swing.JButton();
		jBtS0 = new javax.swing.JButton();
		jBtSPoint = new javax.swing.JButton();
		jBtSEquals = new javax.swing.JButton();
		jBtSAdd = new javax.swing.JButton();
		jBtSSub = new javax.swing.JButton();
		jBtSMul = new javax.swing.JButton();
		jBtSDiv = new javax.swing.JButton();
		jBtSBack = new javax.swing.JButton();
		jBtSClean = new javax.swing.JButton();
		jBtSFactorial = new javax.swing.JButton();
		jBtSSin = new javax.swing.JButton();
		jBtScos = new javax.swing.JButton();
		jBtSTan = new javax.swing.JButton();
		jBtSLn = new javax.swing.JButton();
		jBtSLog = new javax.swing.JButton();
		jBtSPow = new javax.swing.JButton();
		jBtSSquar = new javax.swing.JButton();
		jBtSPI = new javax.swing.JButton();
		jBtSLeftPt = new javax.swing.JButton();
		jBtSRightPt = new javax.swing.JButton();
		jBtSE = new javax.swing.JButton();

		displayStand.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		keyBoardChange
				.setIcon(new javax.swing.ImageIcon(
						"E:\\User-Lucifer\\Workspaces\\langsin\\java_core\\change.jpg")); // NOI18N
		
		keyBoardChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
//		displayStand.add(keyBoardChange,
//				new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 40,
//						40));

		editStand.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 48));
		editStand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		editStand.setText(edit);
		editStand.setAlignmentX(0.0F);
		editStand.setAlignmentY(0.0F);
		editStand.setEnabled(false);
		editStand.setFocusable(false);
		editStand.setRequestFocusEnabled(false);
		editStand.setVerifyInputWhenFocusTarget(false);
		editStand.addMouseListener(listenerStand);
		displayStand.add(editStand,
				new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 360,
						90));

		formulaStand.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		formulaStand.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
		formulaStand.setEnabled(false);
		formulaStand.setFocusable(false);
		formulaStand.setRequestFocusEnabled(false);
		formulaStand.addMouseListener(listenerStand);
		displayStand
				.add(formulaStand,
						new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0,
								360, 71));

		getContentPane().add(displayStand, java.awt.BorderLayout.NORTH);

		keyBoard.setBackground(new java.awt.Color(251, 251, 251));
		keyBoard.setLayout(new java.awt.GridBagLayout());
		jBt1.setBackground(new java.awt.Color(255, 255, 255));
		jBt1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt1.setText("1");
		jBt1.setAlignmentY(0.0F);
		jBt1.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt1.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt1, gridBagConstraints);

		jBt2.setBackground(new java.awt.Color(255, 255, 255));
		jBt2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt2.setText("2");
		jBt2.setAlignmentY(0.0F);
		jBt2.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt2.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt2, gridBagConstraints);

		jBt3.setBackground(new java.awt.Color(255, 255, 255));
		jBt3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt3.setText("3");
		jBt3.setAlignmentY(0.0F);
		jBt3.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt3.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt3, gridBagConstraints);

		jBt4.setBackground(new java.awt.Color(255, 255, 255));
		jBt4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt4.setText("4");
		jBt4.setAlignmentY(0.0F);
		jBt4.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt4.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt4, gridBagConstraints);

		jBt5.setBackground(new java.awt.Color(255, 255, 255));
		jBt5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt5.setText("5");
		jBt5.setAlignmentY(0.0F);
		jBt5.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt5.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt5, gridBagConstraints);

		jBt6.setBackground(new java.awt.Color(255, 255, 255));
		jBt6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt6.setText("6");
		jBt6.setAlignmentY(0.0F);
		jBt6.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt6.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt6, gridBagConstraints);

		jBt7.setBackground(new java.awt.Color(255, 255, 255));
		jBt7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt7.setText("7");
		jBt7.setAlignmentY(0.0F);
		jBt7.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt7.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt7, gridBagConstraints);

		jBt8.setBackground(new java.awt.Color(255, 255, 255));
		jBt8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt8.setText("8");
		jBt8.setAlignmentY(0.0F);
		jBt8.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt8.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt8, gridBagConstraints);

		jBt9.setBackground(new java.awt.Color(255, 255, 255));
		jBt9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt9.setText("9");
		jBt9.setAlignmentY(0.0F);
		jBt9.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt9.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt9, gridBagConstraints);

		jBt0.setBackground(new java.awt.Color(255, 255, 255));
		jBt0.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBt0.setText("0");
		jBt0.setAlignmentY(0.0F);
		jBt0.setPreferredSize(new java.awt.Dimension(90, 90));
		jBt0.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBt0, gridBagConstraints);

		jBtPoint.setBackground(new java.awt.Color(255, 255, 255));
		jBtPoint.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtPoint.setText(".");
		jBtPoint.setAlignmentY(0.0F);
		jBtPoint.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtPoint.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtPoint, gridBagConstraints);

		jBtEquals.setBackground(new java.awt.Color(255, 102, 0));
		jBtEquals.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtEquals.setText("=");
		jBtEquals.setAlignmentY(0.0F);
		jBtEquals.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtSEquals.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.gridheight = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtEquals, gridBagConstraints);

		jBtAdd.setBackground(new java.awt.Color(235, 235, 235));
		jBtAdd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtAdd.setText("+");
		jBtAdd.setAlignmentY(0.0F);
		jBtAdd.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtAdd.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtAdd, gridBagConstraints);

		jBtSub.setBackground(new java.awt.Color(235, 235, 235));
		jBtSub.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSub.setText("-");
		jBtSub.setAlignmentY(0.0F);
		jBtSub.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtSub.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtSub, gridBagConstraints);

		jBtMul.setBackground(new java.awt.Color(235, 235, 235));
		jBtMul.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtMul.setText("\u00d7");
		jBtMul.setAlignmentY(0.0F);
		jBtMul.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtMul.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtMul, gridBagConstraints);

		jBtDiv.setBackground(new java.awt.Color(235, 235, 235));
		jBtDiv.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtDiv.setText("\u00f7");
		jBtDiv.setAlignmentY(0.0F);
		jBtDiv.setPreferredSize(new java.awt.Dimension(90, 90));
		jBtDiv.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtDiv, gridBagConstraints);

		jBtBack.setBackground(new java.awt.Color(235, 235, 235));
		jBtBack.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtBack.setForeground(new java.awt.Color(255, 102, 0));
		jBtBack.setText("\u2190");
		jBtBack.setAlignmentY(0.0F);
		jBtBack.setPreferredSize(new java.awt.Dimension(90, 90));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtBack, gridBagConstraints);

		jBtClean.setBackground(new java.awt.Color(235, 235, 235));
		jBtClean.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtClean.setForeground(new java.awt.Color(255, 102, 0));
		jBtClean.setText("C");
		jBtClean.setPreferredSize(new java.awt.Dimension(90, 90));
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		keyBoard.add(jBtClean, gridBagConstraints);

		getContentPane().add(keyBoard, java.awt.BorderLayout.CENTER);
		// keyBoard.getAccessibleContext().setAccessibleParent(this);

		scienceKeyBoard.setLayout(new java.awt.GridBagLayout());

		jBtS1.setBackground(new java.awt.Color(255, 255, 255));
		jBtS1.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS1.setText("1");
		jBtS1.setAlignmentY(0.0F);
		jBtS1.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS1.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS1, gridBagConstraints);

		jBtS2.setBackground(new java.awt.Color(255, 255, 255));
		jBtS2.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS2.setText("2");
		jBtS2.setAlignmentY(0.0F);
		jBtS2.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS2.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS2, gridBagConstraints);

		jBtS3.setBackground(new java.awt.Color(255, 255, 255));
		jBtS3.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS3.setText("3");
		jBtS3.setAlignmentY(0.0F);
		jBtS3.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS3.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS3, gridBagConstraints);

		jBtS4.setBackground(new java.awt.Color(255, 255, 255));
		jBtS4.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS4.setText("4");
		jBtS4.setAlignmentY(0.0F);
		jBtS4.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS4.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS4, gridBagConstraints);

		jBtS5.setBackground(new java.awt.Color(255, 255, 255));
		jBtS5.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS5.setText("5");
		jBtS5.setAlignmentY(0.0F);
		jBtS5.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS5.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS5, gridBagConstraints);

		jBtS6.setBackground(new java.awt.Color(255, 255, 255));
		jBtS6.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS6.setText("6");
		jBtS6.setAlignmentY(0.0F);
		jBtS6.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS6.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS6, gridBagConstraints);

		jBtS7.setBackground(new java.awt.Color(255, 255, 255));
		jBtS7.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS7.setText("7");
		jBtS7.setAlignmentY(0.0F);
		jBtS7.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS7.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS7, gridBagConstraints);

		jBtS8.setBackground(new java.awt.Color(255, 255, 255));
		jBtS8.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS8.setText("8");
		jBtS8.setAlignmentY(0.0F);
		jBtS8.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS8.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS8, gridBagConstraints);

		jBtS9.setBackground(new java.awt.Color(255, 255, 255));
		jBtS9.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS9.setText("9");
		jBtS9.setAlignmentY(0.0F);
		jBtS9.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS9.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS9, gridBagConstraints);

		jBtS0.setBackground(new java.awt.Color(255, 255, 255));
		jBtS0.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtS0.setText("0");
		jBtS0.setAlignmentY(0.0F);
		jBtS0.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtS0.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtS0, gridBagConstraints);

		jBtSPoint.setBackground(new java.awt.Color(255, 255, 255));
		jBtSPoint.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSPoint.setText(".");
		jBtSPoint.setAlignmentY(0.0F);
		jBtSPoint.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSPoint.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSPoint, gridBagConstraints);

		jBtSEquals.setBackground(new java.awt.Color(255, 102, 0));
		jBtSEquals.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSEquals.setText("=");
		jBtSEquals.setAlignmentY(0.0F);
		jBtSEquals.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSEquals.addActionListener(listenerEquals);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSEquals, gridBagConstraints);

		jBtSAdd.setBackground(new java.awt.Color(235, 235, 235));
		jBtSAdd.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSAdd.setText("+");
		jBtSAdd.setAlignmentY(0.0F);
		jBtSAdd.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSAdd.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSAdd, gridBagConstraints);

		jBtSSub.setBackground(new java.awt.Color(235, 235, 235));
		jBtSSub.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSSub.setText("-");
		jBtSSub.setAlignmentY(0.0F);
		jBtSSub.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSSub.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSSub, gridBagConstraints);

		jBtSMul.setBackground(new java.awt.Color(235, 235, 235));
		jBtSMul.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSMul.setText("\u00d7");
		jBtSMul.setAlignmentY(0.0F);
		jBtSMul.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSMul.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSMul, gridBagConstraints);

		jBtSDiv.setBackground(new java.awt.Color(235, 235, 235));
		jBtSDiv.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSDiv.setText("\u00f7");
		jBtSDiv.setAlignmentY(0.0F);
		jBtSDiv.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSDiv.addActionListener(listener);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSDiv, gridBagConstraints);

		jBtSBack.setBackground(new java.awt.Color(235, 235, 235));
		jBtSBack.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSBack.setForeground(new java.awt.Color(255, 102, 0));
		jBtSBack.setText("\u2190");
		jBtSBack.setAlignmentY(0.0F);
		jBtSBack.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSBack.addActionListener(listenerFunctions);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSBack, gridBagConstraints);

		jBtSClean.setBackground(new java.awt.Color(235, 235, 235));
		jBtSClean.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSClean.setForeground(new java.awt.Color(255, 102, 0));
		jBtSClean.setText("C");
		jBtSClean.setAlignmentY(0.0F);
		jBtSClean.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSClean.addActionListener(listenerFunctions);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 4;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSClean, gridBagConstraints);

		jBtSFactorial.setBackground(new java.awt.Color(235, 235, 235));
		jBtSFactorial.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSFactorial.setText("!");
		jBtSFactorial.setAlignmentY(0.0F);
		jBtSFactorial.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSFactorial.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSFactorial, gridBagConstraints);

		jBtSSin.setBackground(new java.awt.Color(235, 235, 235));
		jBtSSin.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSSin.setText("sin");
		jBtSSin.setAlignmentY(0.0F);
		jBtSSin.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSSin.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSSin, gridBagConstraints);

		jBtScos.setBackground(new java.awt.Color(235, 235, 235));
		jBtScos.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtScos.setText("cos");
		jBtScos.setAlignmentY(0.0F);
		jBtScos.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtScos.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 2;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtScos, gridBagConstraints);

		jBtSTan.setBackground(new java.awt.Color(235, 235, 235));
		jBtSTan.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSTan.setText("tan");
		jBtSTan.setAlignmentY(0.0F);
		jBtSTan.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSTan.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 3;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSTan, gridBagConstraints);

		jBtSLn.setBackground(new java.awt.Color(235, 235, 235));
		jBtSLn.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSLn.setText("ln");
		jBtSLn.setAlignmentY(0.0F);
		jBtSLn.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSLn.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 4;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSLn, gridBagConstraints);

		jBtSLog.setBackground(new java.awt.Color(235, 235, 235));
		jBtSLog.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSLog.setText("log");
		jBtSLog.setAlignmentY(0.0F);
		jBtSLog.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSLog.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 5;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSLog, gridBagConstraints);

		jBtSPow.setBackground(new java.awt.Color(235, 235, 235));
		jBtSPow.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSPow.setText("^");
		jBtSPow.setAlignmentY(0.0F);
		jBtSPow.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSPow.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSPow, gridBagConstraints);

		jBtSSquar.setBackground(new java.awt.Color(235, 235, 235));
		jBtSSquar.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSSquar.setText("\u221a");
		jBtSSquar.setAlignmentY(0.0F);
		jBtSSquar.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSSquar.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSSquar, gridBagConstraints);

		jBtSPI.setBackground(new java.awt.Color(235, 235, 235));
		jBtSPI.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSPI.setText("\u03c0");
		jBtSPI.setAlignmentY(0.0F);
		jBtSPI.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSPI.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSPI, gridBagConstraints);

		jBtSLeftPt.setBackground(new java.awt.Color(235, 235, 235));
		jBtSLeftPt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSLeftPt.setText("(");
		jBtSLeftPt.setAlignmentY(0.0F);
		jBtSLeftPt.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSLeftPt.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSLeftPt, gridBagConstraints);

		jBtSRightPt.setBackground(new java.awt.Color(235, 235, 235));
		jBtSRightPt.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSRightPt.setText(")");
		jBtSRightPt.setAlignmentY(0.0F);
		jBtSRightPt.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSRightPt.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 2;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSRightPt, gridBagConstraints);

		jBtSE.setBackground(new java.awt.Color(235, 235, 235));
		jBtSE.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 24));
		jBtSE.setText("e");
		jBtSE.setAlignmentY(0.0F);
		jBtSE.setPreferredSize(new java.awt.Dimension(72, 75));
		jBtSE.addActionListener(listenerScience);
		gridBagConstraints = new java.awt.GridBagConstraints();
		gridBagConstraints.gridx = 3;
		gridBagConstraints.gridy = 1;
		gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
		scienceKeyBoard.add(jBtSE, gridBagConstraints);

		getContentPane().add(scienceKeyBoard, java.awt.BorderLayout.CENTER);

//		setUndecorated(true);//去除边框
		pack();
	}// </editor-fold>
		// GEN-END:initComponents

	MouseAdapter listenerStand = new MouseAdapter() {
		public void mousePressed(MouseEvent e) {
			Clipboard board = Toolkit.getDefaultToolkit().getSystemClipboard();
			StringSelection str = new StringSelection(formulaStand.getText()+editStand.getText());
			board.setContents(str, null);
			JOptionPane.showMessageDialog(null, "内容已复制", "剪贴板", 
					JOptionPane.INFORMATION_MESSAGE);
		}
	};
	
	ActionListener listener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "1"
					||e.getActionCommand() == "2"
					|| e.getActionCommand() == "3"
					|| e.getActionCommand() == "4"
					|| e.getActionCommand() == "5"
					|| e.getActionCommand() == "6"
					|| e.getActionCommand() == "7"
					|| e.getActionCommand() == "8"
					|| e.getActionCommand() == "9"
					|| e.getActionCommand() == "0") {
				if (edit == "0") {
					edit = e.getActionCommand();
					editStand.setText(edit);
				} else {
					edit = edit + e.getActionCommand();
					editStand.setText(edit);
				}

			}

			if (e.getActionCommand() == ".") {
				if (!hasPoint) {
					hasPoint = true;
					if (edit.charAt(edit.length()-1) == '+'
							||edit.charAt(edit.length()-1) == '-'
							||edit.charAt(edit.length()-1) == '×'
							||edit.charAt(edit.length()-1) == '÷') {
						edit = edit + "0";
					}
					edit = edit + e.getActionCommand();
					editStand.setText(edit);
				}
				

			}

			if (e.getActionCommand() == "+"
					|| e.getActionCommand() == "-"
					|| e.getActionCommand() == "×"
					|| e.getActionCommand() == "÷") {
				if (edit.charAt(edit.length()-1) == '+'
						||edit.charAt(edit.length()-1) == '-'
						||edit.charAt(edit.length()-1) == '×'
						||edit.charAt(edit.length()-1) == '÷') {
					edit = edit.substring(0, edit.length()-1) + e.getActionCommand();
				} else {
					edit = edit + e.getActionCommand();
				}
				hasPoint = false;
				editStand.setText(edit);
			}

		}
	};

	ActionListener listenerScience = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "!"
					||e.getActionCommand() == "^") {
				edit = edit + e.getActionCommand();
				editStand.setText(edit);
				
			}
			if (e.getActionCommand() == "\u221a"
					||e.getActionCommand() == "\u03c0"
					||e.getActionCommand() == "e"
					||e.getActionCommand() == "("
					||e.getActionCommand() == ")"
					||e.getActionCommand() == "sin"
					||e.getActionCommand() == "cos"
					||e.getActionCommand() == "tan"
					||e.getActionCommand() == "ln"
					||e.getActionCommand() == "log") {
				if (edit == "0") {
					edit = e.getActionCommand();
					editStand.setText(edit);
				} else {
					edit = edit + e.getActionCommand();
					editStand.setText(edit);
				}
			}
		}
	};	
	
	ActionListener listenerFunctions = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "C") {
				edit = "0";
				editStand.setText(edit);
				hasPoint = false;
				formulaStand.setText("");
			}
			if (e.getActionCommand() == "\u2190") {
				if (edit.length() != 1) {
					if (edit.charAt(edit.length()-1) == '.') {
						hasPoint = false;
					}
					edit = (String) edit.subSequence(0, edit.length()-1);
					editStand.setText(edit);
				} else {
					edit = "0";
					editStand.setText(edit);
				}
			}
		}
	};
	
	ActionListener listenerEquals = new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			formulaStand.setText(edit + "=");
			hasPoint = false;
			String result;
			try {
				result = CaculateFunction.Evaluate(edit + "=");
			} catch (Exception e1) {
				result = "syntax error";
			}
			if (Double.parseDouble(result)%1 == 0) {
				editStand.setText(String.valueOf((int)Double.parseDouble((result))));
			}else{
				editStand.setText(String.valueOf((float)Double.parseDouble((result))));
			}
			edit = "0";
		}
	};

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Cal().setVisible(true);
			}
		});
	}

	// GEN-BEGIN:variables
	// Variables declaration - do not modify

	private javax.swing.JPanel displayStand;
	private javax.swing.JButton jBt0;
	private javax.swing.JButton jBt1;
	private javax.swing.JButton jBt2;
	private javax.swing.JButton jBt3;
	private javax.swing.JButton jBt4;
	private javax.swing.JButton jBt5;
	private javax.swing.JButton jBt6;
	private javax.swing.JButton jBt7;
	private javax.swing.JButton jBt8;
	private javax.swing.JButton jBt9;
	private javax.swing.JButton jBtAdd;
	private javax.swing.JButton jBtBack;
	private javax.swing.JButton jBtClean;
	private javax.swing.JButton jBtDiv;
	private javax.swing.JButton jBtEquals;
	private javax.swing.JButton jBtMul;
	private javax.swing.JButton jBtPoint;
	private javax.swing.JButton jBtS0;
	private javax.swing.JButton jBtS1;
	private javax.swing.JButton jBtS2;
	private javax.swing.JButton jBtS3;
	private javax.swing.JButton jBtS4;
	private javax.swing.JButton jBtS5;
	private javax.swing.JButton jBtS6;
	private javax.swing.JButton jBtS7;
	private javax.swing.JButton jBtS8;
	private javax.swing.JButton jBtS9;
	private javax.swing.JButton jBtSAdd;
	private javax.swing.JButton jBtSBack;
	private javax.swing.JButton jBtSClean;
	private javax.swing.JButton jBtSDiv;
	private javax.swing.JButton jBtSE;
	private javax.swing.JButton jBtSEquals;
	private javax.swing.JButton jBtSFactorial;
	private javax.swing.JButton jBtSLeftPt;
	private javax.swing.JButton jBtSLn;
	private javax.swing.JButton jBtSLog;
	private javax.swing.JButton jBtSMul;
	private javax.swing.JButton jBtSPI;
	private javax.swing.JButton jBtSPoint;
	private javax.swing.JButton jBtSPow;
	private javax.swing.JButton jBtSRightPt;
	private javax.swing.JButton jBtSSin;
	private javax.swing.JButton jBtSSquar;
	private javax.swing.JButton jBtSSub;
	private javax.swing.JButton jBtSTan;
	private javax.swing.JButton jBtScos;
	private javax.swing.JButton jBtSub;
	private javax.swing.JTextField formulaStand;
	private javax.swing.JTextField editStand;
	private javax.swing.JPanel keyBoard;
	private javax.swing.JToggleButton keyBoardChange;
	private javax.swing.JPanel scienceKeyBoard;
	private String formula;
	private String edit = "0";
	private boolean hasPoint = false;
	
}