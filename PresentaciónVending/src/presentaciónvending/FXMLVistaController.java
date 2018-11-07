/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentaciónvending;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Emanuel Álvarez
 */
public class FXMLVistaController implements Initializable {
    
    private List<String> productoscreados = new ArrayList<>();
    
    @FXML
    private Label label;
    @FXML
    private Button btnNuevaVenta;
    @FXML
    private Label lblFecha;
    @FXML
    private Button btnAgregarLinea;
    @FXML
    private Button btnEliminarLinea;
    @FXML
    private Button btnMonedaMil;
    @FXML
    private Button btnMonedaQui;
    @FXML
    private Button btnTerminarVenta;
    @FXML
    private Button btnGenerarReporte;
    @FXML
    private ComboBox<String> ListProductos;
    
    private ObservableList<String> productos = FXCollections.observableArrayList();
    
    //para la tabla
    private ObservableList<String> productosTabla = FXCollections.observableArrayList();
    @FXML
    private Label lblMostrar;
    @FXML
    private TableView<String> tblLineasVenta;
    @FXML
    private TableColumn<String, String> colProducto;
    @FXML
    private TableColumn<String, String> colCantidad;
    @FXML
    private TableColumn<String, String> colPrecio;
    @FXML
    private TableColumn<String, String> ColSubTotal;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        llenarProductos();
        configureComboProductos();
    }  
    
    private void llenarProductos(){
        this.productoscreados.add("Gaseosa");
        this.productoscreados.add("Hamburguesa");
        this.productoscreados.add("Pizza");
        this.productoscreados.add("Almuerzo");
        
        productos.setAll(this.productoscreados);
        ListProductos.setItems(productos);
        
    }
    
    @FXML
    public void configureComboProductos(){
        this.lblMostrar.setText(ListProductos.getValue());
        
        /*PropertyValueFactory<String, String> idProperty
                = new PropertyValueFactory<String, String>("Producto");
        ObservableValue<String> producto;
        producto.
        colProducto.setCellValueFactory(ListProductos.getValue());*/
        this.productosTabla.add(ListProductos.getValue());
        //colProducto.setCellValueFactory(
        //new PropertyValueFactory<>("Produco"));
        this.tblLineasVenta.setItems(productosTabla);
        PropertyValueFactory<String, String> nombreProperty
                = new PropertyValueFactory<String, String>("Producto");
        colProducto.setCellValueFactory(nombreProperty);

        /*PropertyValueFactory<Persona, Double> edadProperty
                = new PropertyValueFactory<Persona, Double>("edad");
        colEdad.setCellValueFactory(edadProperty);*/
    }
    
}
