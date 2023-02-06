/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Ports;

import java.util.List;
import Domain.Document;
/**
 *
 * @author mauro
 */
public interface DocumentRepositorySalida {
    public void createDocument(Document documento);
 
    public Document getDocument(String documentName);
 
    public List<Document> getAllDocument();
}
