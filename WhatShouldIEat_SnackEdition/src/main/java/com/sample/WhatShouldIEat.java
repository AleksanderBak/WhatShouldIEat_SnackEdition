
package com.sample;

import java.util.ArrayList;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.QueryResultsRow;
import org.kie.api.runtime.rule.QueryResults;
import org.kie.api.logger.KieRuntimeLogger;

public class WhatShouldIEat{
    public static final void main(String[] args) throws Throwable {
		KieServices services = KieServices.Factory.get();
		KieContainer container = services.getKieClasspathContainer();
		KieSession session = container.newKieSession("ksession-rules");
		KieRuntimeLogger logger = services.getLoggers().newFileLogger(session, "test");
		session.fireAllRules();
		logger.close();
    }
}