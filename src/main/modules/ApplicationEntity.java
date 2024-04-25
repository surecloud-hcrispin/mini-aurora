package main.modules;


import javax.persistence.*;
import java.util.List;

@Entity
public class ApplicationEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    private String name;
    private String description;

    @OneToMany(mappedBy = "id")
    private List<View> views;
//    private List<String> permissions;
//    private List<Attribute> attributes;
//    private List<Long> linkedEntities;
//    private List<String> questionSets;
//    private String workflow;
//    private List<String> notifications;

    public ApplicationEntity(Long id, String name, String description, List<View> views,
                             List<String> permissions, List<Attribute> attributes, List<Long> linkedEntities,
                             List<String> questionSets, String workflow, List<String> notifications) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.views = views;
//        this.permissions = permissions;
//        this.attributes = attributes;
//        this.linkedEntities = linkedEntities;
//        this.questionSets = questionSets;
//        this.workflow = workflow;
//        this.notifications = notifications;
    }

    public ApplicationEntity() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter and Setter methods for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for 'description'
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Getter and Setter methods for 'views'
    public List<View> getViews() {
        return views;
    }

    public void setViews(List<View> views) {
        this.views = views;
    }

//    // Getter and Setter methods for 'permissions'
//    public List<String> getPermissions() {
//        return permissions;
//    }
//
//    public void setPermissions(List<String> permissions) {
//        this.permissions = permissions;
//    }
//
//    // Getter and Setter methods for 'attributes'
//    public List<Attribute> getAttributes() {
//        return attributes;
//    }
//
//    public void setAttributes(List<Attribute> attributes) {
//        this.attributes = attributes;
//    }
//
//    // Getter and Setter methods for 'linkedEntities'
//    public List<Long> getLinkedEntities() {
//        return linkedEntities;
//    }
//
//    public void setLinkedEntities(List<Long> linkedEntities) {
//        this.linkedEntities = linkedEntities;
//    }
//
//    // Getter and Setter methods for 'questionSets'
//    public List<String> getQuestionSets() {
//        return questionSets;
//    }
//
//    public void setQuestionSets(List<String> questionSets) {
//        this.questionSets = questionSets;
//    }
//
//    public String getWorkflow() {
//        return workflow;
//    }
//
//    public void setWorkflow(String workflow) {
//        this.workflow = workflow;
//    }
//
//    public List<String> getNotifications() {
//        return notifications;
//    }
//
//    public void setNotifications(List<String> notifications) {
//        this.notifications = notifications;
//    }
}
