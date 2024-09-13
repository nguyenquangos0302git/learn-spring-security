import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    @Test
    public void test() {
        String testt = "Instructor: When we are talking about OAuth 2.0\n" +
                "\n" +
                "and Open ID protocols,\n" +
                "\n" +
                "I told you that these are only protocols or specifications\n" +
                "\n" +
                "and they don't provide any implementations.\n" +
                "\n" +
                "But bigger organizations like Google, Microsoft,\n" +
                "\n" +
                "GitHub, Twitter, Netflix, all these organizations\n" +
                "\n" +
                "by taking these OAuth 2.0 and Open ID specifications\n" +
                "\n" +
                "they started building their own authorization servers\n" +
                "\n" +
                "which implements all the specifications defined\n" +
                "\n" +
                "in these protocols.\n" +
                "\n" +
                "But this also opened a wide market\n" +
                "\n" +
                "inside the software industry where everyone started looking\n" +
                "\n" +
                "for ready made authorization servers\n" +
                "\n" +
                "which they can leverage inside their organizations,\n" +
                "\n" +
                "because not every company or not every organization\n" +
                "\n" +
                "can afford building their own authorization servers\n" +
                "\n" +
                "like Google and Facebook.\n" +
                "\n" +
                "To end cash that market,\n" +
                "\n" +
                "there are many authorization server market came\n" +
                "\n" +
                "into picture.\n" +
                "\n" +
                "Like you can see here\n" +
                "\n" +
                "Keycloak is one such authorization server.\n" +
                "\n" +
                "So this is a ready product that is available for you.\n" +
                "\n" +
                "And very similarly, we also have other famous options\n" +
                "\n" +
                "inside the industry like Okta, ForgeRock,\n" +
                "\n" +
                "even Amazon has their own product with the name,\n" +
                "\n" +
                "Amazon Cognito.\n" +
                "\n" +
                "So all these companies\n" +
                "\n" +
                "they're trying to sell these authorization servers\n" +
                "\n" +
                "to the smaller organizations,\n" +
                "\n" +
                "or to the organizations where they're not interested\n" +
                "\n" +
                "in building their own authorization server from scratch.\n" +
                "\n" +
                "But please note that I'm not saying\n" +
                "\n" +
                "that we have only four of these options.\n" +
                "\n" +
                "There are many, many options inside the industry,\n" +
                "\n" +
                "but to my knowledge\n" +
                "\n" +
                "these are the mostly used authorization server products.\n" +
                "\n" +
                "And inside this course we are going to leverage a Keycloak,\n" +
                "\n" +
                "because with two reasons.\n" +
                "\n" +
                "One is it is an open source.\n" +
                "\n" +
                "There is no money involved.\n" +
                "\n" +
                "You can always download and set up in your own server\n" +
                "\n" +
                "and laptop and start using it straight away.\n" +
                "\n" +
                "Whereas all other Auth servers like Okta, ForgeRock,\n" +
                "\n" +
                "Amazon Cognito,\n" +
                "\n" +
                "they are commercial products.\n" +
                "\n" +
                "And the other reason that I'm choosing the Keycloak is,\n" +
                "\n" +
                "though it is an open source of product,\n" +
                "\n" +
                "it is a very stable product\n" +
                "\n" +
                "and Keycloak team,\n" +
                "\n" +
                "they always do a very good job in updating the Keycloak\n" +
                "\n" +
                "Auth server regularly based upon\n" +
                "\n" +
                "the OAuth 2.0 specifications\n" +
                "\n" +
                "and the other security standards that we have\n" +
                "\n" +
                "inside the industry.\n" +
                "\n" +
                "On top of that, this Keycloak is sponsored and maintained\n" +
                "\n" +
                "by none other than Red Hat.\n" +
                "\n" +
                "With all these reasons, Keycloak is a very\n" +
                "\n" +
                "good consideration to use as an authorization server.\n" +
                "\n" +
                "So let me close all the other tabs that we have here.\n" +
                "\n" +
                "If you look at this Keycloak.org website,\n" +
                "\n" +
                "you can see on a high level what are the features\n" +
                "\n" +
                "that are provided by the Keycloak.\n" +
                "\n" +
                "Whenever you use Keycloak as an authorization server,\n" +
                "\n" +
                "you will get complete control.\n" +
                "\n" +
                "You can take this product and set up inside your own\n" +
                "\n" +
                "bare-metal servers or inside your own cloud,\n" +
                "\n" +
                "or inside your local system\n" +
                "\n" +
                "and you'll have complete admin privileges.\n" +
                "\n" +
                "And with these admin privileges,\n" +
                "\n" +
                "you can create any number of admins or users.\n" +
                "\n" +
                "And one more feature of the Keycloak is,\n" +
                "\n" +
                "it also expose many risk services,\n" +
                "\n" +
                "using which we can create users,\n" +
                "\n" +
                "we can create admins, we can create roles,\n" +
                "\n" +
                "we can get an access token, we can validate an access token.\n" +
                "\n" +
                "There are multiple desk services available\n" +
                "\n" +
                "under the Keycloak product.\n" +
                "\n" +
                "If you are interested, you can always explore\n" +
                "\n" +
                "under the official documentation of Keycloak.\n" +
                "\n" +
                "And you can see it supports single sign-on\n" +
                "\n" +
                "which means if you have multiple applications\n" +
                "\n" +
                "inside your organization and if all of them point\n" +
                "\n" +
                "to the same authorization server, which is Keycloak,\n" +
                "\n" +
                "my end user can only login into one of the application.\n" +
                "\n" +
                "And the same access token can be leveraged\n" +
                "\n" +
                "in all other applications without the need of logging\n" +
                "\n" +
                "in again and again in different, different applications.\n" +
                "\n" +
                "And it also supports open ID connect, OAuth 2.0,\n" +
                "\n" +
                "it also provides central management\n" +
                "\n" +
                "for creating admins and users.\n" +
                "\n" +
                "It also provide you social login,\n" +
                "\n" +
                "which means you can also set up Github login,\n" +
                "\n" +
                "Facebook login with the help of Keycloak.\n" +
                "\n" +
                "And you can also make your Keycloak to point\n" +
                "\n" +
                "to your storage system like LDAP, active directory\n" +
                "\n" +
                "or any database that you want so that all your user details\n" +
                "\n" +
                "along with their passwords will be stored\n" +
                "\n" +
                "inside these storage systems.\n" +
                "\n" +
                "With this, I'm assuming you are convinced\n" +
                "\n" +
                "to use the Keycloak.\n" +
                "\n" +
                "In order to get started with this Keycloak,\n" +
                "\n" +
                "we need to go into this downloads page.\n" +
                "\n" +
                "You can see on this page there is a server table.\n" +
                "\n" +
                "Under this server heading\n" +
                "\n" +
                "there is a very first row with the name Keycloak.\n" +
                "\n" +
                "If you look at the right hand side\n" +
                "\n" +
                "there is a download option.\n" +
                "\n" +
                "Here you can download this server\n" +
                "\n" +
                "of Keycloak by clicking on this (indistinct).\n" +
                "\n" +
                "This will start downloading the Keycloak server\n" +
                "\n" +
                "into my local system.\n" +
                "\n" +
                "In the next lecture, we can try to set\n" +
                "\n" +
                "up this Keycloak inside our local system.\n" +
                "\n" +
                "And with that we can get started creating our\n" +
                "\n" +
                "own authorization server for Easy Bank application.\n" +
                "\n" +
                "Thank you and I'll catch you in the next lecture.\n" +
                "\n" +
                "Bye.";

        String[] testx = testt.split("\n");
        List<String> list = Arrays.stream(testx).toList();
        String result = String.join(" ", list);
        System.out.println(result);

    }

}
