import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
@ManagedBean
@SessionScoped
public class eventhandle {
    private String status="True";

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void process()
    {
        if(status.equals("True"))
        {
            status="False";
        }
        else
        {
            status="True";
        }
    }
    
}
