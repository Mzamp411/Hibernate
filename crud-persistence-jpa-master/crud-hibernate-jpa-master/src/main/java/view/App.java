package view;

import controller.ClienteJpaDAO;
import model.Cliente;

public class App
{
    public static void main( String[] args )
    {
    	 Cliente cliente = new Cliente();
         cliente.setCpf("000.000.000/00");
         cliente.setId(1);
         cliente.setNome("Jeferson");
         cliente.setRg("00.000.000-0");
         ClienteJpaDAO.getInstance().merge(cliente);
         System.out.println("hello world");
    }
}
