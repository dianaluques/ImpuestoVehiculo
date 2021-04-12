/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package impuestovehiculo;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author Nestor Luque
 */
public class ImpuestoVehiculo extends JFrame implements ActionListener{

    JLabel l1;
    JLabel l2;
    JLabel l3;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    JRadioButton rb5;
    JRadioButton rb6;
    JRadioButton rb7;
    JRadioButton rb8;
    JButton b1;
    ButtonGroup grupoRadio;

    public ImpuestoVehiculo() {
        setSize(385, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        grupoRadio = new ButtonGroup();
        
        b1 = new JButton("Calcular impuesto");
        b1.setBounds(200, 280, 160, 20);
        //escuchar con ActionListener el componente
        b1.addActionListener(this);
        
        l1 = new JLabel ("IMPUESTO DEL VEHICULO");
        l1.setBounds(100, 20, 200, 30);
        
        l2 = new JLabel ("Seleccione el vehiculo");
        l2.setBounds(20, 50, 200, 20);
        
        rb1 = new JRadioButton("Chevrolet spark GT F.E 2020");
        rb1.setBounds(20, 70, 200, 20);
        
        rb2 = new JRadioButton("Renault Logan Authentique 2016");
        rb2.setBounds(20, 90, 210, 20);
        
        rb3 = new JRadioButton("Toyota Prado 3P 2009");
        rb3.setBounds(20, 110, 200, 20);
        
        rb4 = new JRadioButton("Ford ranger 2.6 DOB. 4X4 2012");
        rb4.setBounds(20, 130, 200, 20);
         
        rb5 = new JRadioButton("Mazda demio 2008");
        rb5.setBounds(20, 150, 200, 20);
         
        l3 = new JLabel ("Seleccione al descuento al que pertenece");
        l3.setBounds(20, 180, 240, 20);
        
        rb6 = new JRadioButton("Descuento por pronto pago");
        rb6.setBounds(20, 200, 200, 20);
        
        rb7 = new JRadioButton("Descuento por ser de servicio publico ");
        rb7.setBounds(20, 220, 300, 20);
        
        rb8 = new JRadioButton("Descuento por translado de cuenta");
        rb8.setBounds(20, 240, 260, 20);
        
       grupoRadio.add(rb1);
       grupoRadio.add(rb2);
       grupoRadio.add(rb3);
       grupoRadio.add(rb4);
       grupoRadio.add(rb5);
        
        add(l1);
        add(l2);
        add(rb1);
        add(rb2);
        add(rb3);
        add(rb4);
        add(rb5);
        add(l3);
        add(rb6);
        add(rb7);
        add(rb8);
        add(b1);
        
        setVisible(true);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        ImpuestoVehiculo miInterfaz = new ImpuestoVehiculo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int avaluo1=30000000;
        int avaluo2=24500000;
        int avaluo3=25000000;
        int avaluo4=28000000;
        int avaluo5=7500000;
        double imp, valorimp, valorimp1, valorimp2,descVal, descVal1;
        double porcImp= 0.01503;
        double descPronPag= 0.1;
        double descServPubic= 0.02;
        double descTransCuen= 0.15;
        double totalPagar = 0;
        
        if( rb1.isSelected()){
            
            if( rb6.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
                
            }
            if( rb7.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descServPubic;
                totalPagar =imp - valorimp;
                
            }
            if( rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descTransCuen;
                totalPagar =imp - valorimp;
                
            }
            if( rb6.isSelected() && rb7.isSelected()&& rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                descVal=imp - valorimp;
                valorimp1= descVal * descServPubic;
                descVal1=descVal - valorimp1;
                valorimp2 = descVal1 * descTransCuen;
                totalPagar=descVal1 - valorimp2;
                
            }
            JOptionPane.showMessageDialog(null,"El impuesto a pagar es de "+totalPagar);
        }
        
        if( rb2.isSelected()){
            
            if( rb6.isSelected()){
                imp = avaluo2*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb7.isSelected()){
                imp = avaluo2*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb8.isSelected()){
                imp = avaluo2*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb6.isSelected() && rb7.isSelected()&& rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                descVal=imp - valorimp;
                valorimp1= descVal * descServPubic;
                descVal1=descVal - valorimp1;
                valorimp2 = descVal1 * descTransCuen;
                totalPagar=descVal1 - valorimp2;
            }
            JOptionPane.showMessageDialog(null,"El impuesto a pagar es de "+totalPagar);
        }
        
        if( rb3.isSelected()){
            
            if( rb6.isSelected()){
                imp = avaluo3*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb7.isSelected()){
                imp = avaluo3*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb8.isSelected()){
                imp = avaluo3*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb6.isSelected() && rb7.isSelected()&& rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                descVal=imp - valorimp;
                valorimp1= descVal * descServPubic;
                descVal1=descVal - valorimp1;
                valorimp2 = descVal1 * descTransCuen;
                totalPagar=descVal1 - valorimp2;
            }
            JOptionPane.showMessageDialog(null,"El impuesto a pagar es de "+totalPagar);
        }
        
        if( rb4.isSelected()){
            
            if( rb6.isSelected()){
                imp = avaluo4*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb7.isSelected()){
                imp = avaluo4*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb8.isSelected()){
                imp = avaluo4*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb6.isSelected() && rb7.isSelected()&& rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                descVal=imp - valorimp;
                valorimp1= descVal * descServPubic;
                descVal1=descVal - valorimp1;
                valorimp2 = descVal1 * descTransCuen;
                totalPagar=descVal1 - valorimp2;
            }
            JOptionPane.showMessageDialog(null,"El impuesto a pagar es de "+totalPagar);
        }
        
        if( rb5.isSelected()){
            
            if( rb6.isSelected()){
                imp = avaluo5*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb7.isSelected()){
                imp = avaluo5*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb8.isSelected()){
                imp = avaluo5*porcImp;
                valorimp = imp *descPronPag;
                totalPagar =imp - valorimp;
            }
            if( rb6.isSelected() && rb7.isSelected()&& rb8.isSelected()){
                imp = avaluo1*porcImp;
                valorimp = imp *descPronPag;
                descVal=imp - valorimp;
                valorimp1= descVal * descServPubic;
                descVal1=descVal - valorimp1;
                valorimp2 = descVal1 * descTransCuen;
                totalPagar=descVal1 - valorimp2;
            }
            JOptionPane.showMessageDialog(null,"El impuesto a pagar es de "+totalPagar);
        }
        
    }
    
}
