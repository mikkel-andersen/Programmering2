package navigation;

import java.util.ArrayList;

public class NavigationMenu extends NavigationComponent
{
    private String name;
    private ArrayList<NavigationComponent> children = new ArrayList<>();

    public NavigationMenu(String name)
    {
        this.name = name;
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public void print()
    {
        System.out.println("--------------------");
        System.out.println("Navn: " + name);
        System.out.println("Undermenuer: ");
        for (NavigationComponent navigationComponent : children)
        {
            navigationComponent.print();
        }
    }


    @Override
    public void addChild(NavigationComponent navigationComponent)
    {
        children.add(navigationComponent);
    }


    @Override
    public ArrayList<NavigationComponent> getChildren()
    {
        return children;
    }
}
