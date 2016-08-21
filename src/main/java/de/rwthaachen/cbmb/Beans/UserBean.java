//package de.rwthaachen.cbmb.Beans;
//
//import de.rwthaachen.cbmb.Domain.User;
//import de.rwthaachen.cbmb.Service.UserService;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.faces.application.FacesMessage;
//import javax.faces.bean.ManagedBean;
//import javax.faces.bean.ManagedProperty;
//import javax.faces.bean.ViewScoped;
//import javax.faces.component.UIComponent;
//import javax.faces.component.UIInput;
//import javax.faces.context.FacesContext;
//import javax.faces.event.ComponentSystemEvent;
//import java.io.Serializable;
//import java.util.ArrayList;
//import java.util.List;
//
//@Getter
//@Setter
//@ManagedBean
//@ViewScoped
//public class UserBean implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
////    @Autowired
//    @ManagedProperty("#{userService}")
//    UserService userService;
//
//    private User user = new User();
//
//    private List<User> users;
//
////    @PostConstruct
////    public void loadUsers() {
////        users = userService.findAll();
////    }
//
//
//    public String register(){
//
//        userService.save(user);
//        return "login.xhtml?faces-redirect=true";
//    }
//
//
//
//
////    public String register(){
////        User created = new User();
////        created.setId(this.user.getId());
////        created.setFirstName(this.user.getFirstName());
////        created.setLastName(this.user.getLastName());
////        created.setUsername(this.user.getUsername());
////        created.setOriginalPassword(this.user.getPassword());
//////        created.setPassword((this.user.getPassword()));
////
////        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
////        String hashedPassword = passwordEncoder.encode(this.user.getPassword());
////        created.setPassword(hashedPassword);
////
//////        user.setPassword(passwordEncoder.encode(user.getPassword()));
////        User newUser = this.userRepository.save(created);
////        return "login.xhtml?faces-redirect=true";
////    }
//
////    public String register(@Valid User user,
////                           BindingResult result, ModelMap model){
////
////        userService.save(user);
////
////        return "login.xhtml";
////    }
//
//    //    public void findFileById() throws GeneralSecurityException, DecoderException, IOException {
////        User found = userRepository.findOne(this.user.getId());
////        this.user.setId(found.getId());
////        this.user.setUsername(found.getUsername());
////        this.user.setFirstName(found.getFirstName());
////        this.user.setLastName(found.getLastName());
////    }
////
////    public List<UserView> findAllUsers() {
////        List<UserView> users = new ArrayList<>();
////        for (User entity : this.userRepository.findAll()) {
////            UserView view = new UserView();
////            view.setId(entity.getId());
////            view.setUsername(entity.getUsername());
////            view.setFirstName(entity.getFirstName());
////            view.setLastName(entity.getLastName());
////            view.setOriginalPassword(entity.getOriginalPassword());
////            view.setPassword(entity.getPassword());
////            users.add(view);
////        }
////        return users;
////    }
//
//
//    public void validatePassword(ComponentSystemEvent event) {
//
//        FacesContext fc = FacesContext.getCurrentInstance();
//
//        UIComponent components = event.getComponent();
//
//        // get password
//        UIInput uiInputPassword = (UIInput) components
//                .findComponent("password");
//
//        String password = uiInputPassword.getLocalValue() == null ? ""
//                : uiInputPassword.getLocalValue().toString();
//
//        String passwordId = uiInputPassword.getClientId();
//
//        // get confirm password
//        UIInput uiInputConfirmPassword = (UIInput) components
//                .findComponent("confirmPassword");
//        String confirmPassword = uiInputConfirmPassword.getLocalValue() == null ? ""
//                : uiInputConfirmPassword.getLocalValue().toString();
//
//        // Let required="true" do its job.
//        if (password.isEmpty() || confirmPassword.isEmpty()) {
//            return;
//        }
//
//        if (!password.equals(confirmPassword)) {
//
//            FacesMessage msg = new FacesMessage(
//                    "Password must match confirm password");
//            msg.setSeverity(FacesMessage.SEVERITY_ERROR);
//            fc.addMessage(passwordId, msg);
//            fc.renderResponse();
//        }
//
//    }
//
//
//}
