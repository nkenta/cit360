/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MVC;

/**
 *
 * @author Nkenta Uchechukwu
 */
public class ClientMVC {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        //fetch client record on database
        Client model = retriveClientFromDatabase();

        //printout client details on console
        MVC.ClientView view = new MVC.ClientView();

        ClientController controller = new ClientController(model, view);

        controller.updateView();

        //update model data
        controller.setClientName("Nkenta Uchechukwu Ferdinand");
        controller.setClientLocation("Enugu Nigeria");
        controller.setClientOfficeNo("G34WX");

        controller.updateView();
    }
   
    private static Client retriveClientFromDatabase() {
        Client client = new Client();
        client.setName("Micheal Udeoma");
        client.setLocation("Lagos Nigeria");
        client.setOfficeNo("B13CM");
        return client;
    }

}
