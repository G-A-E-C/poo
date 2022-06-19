/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.util.LinkedList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Descripcion;

/**
 *
 * @author Smart
 */
public class ModelTableDescripcion extends DefaultTableModel{
    private List<Descripcion> descricionList;
    
    public ModelTableDescripcion() {
        descricionList = new LinkedList<>();
        addColumn("Cantidad");
        addColumn("Producto");
        addColumn("Precio Unitario");
        addColumn("Valor Total");
        
        
    }
    
    public void agregarDescripcion(Descripcion descripcion){
        descricionList.add(descripcion);
        addRow(new Object[]{
            descripcion.getCantidad(),
            descripcion.getProducto(),
            descripcion.getPrecioUnitario(),
            descripcion.getValorTotal()
        });
    }
}
