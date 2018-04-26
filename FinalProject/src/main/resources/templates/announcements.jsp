<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Announcements</title>
    </head>
    <body>
        <div align="center">
            <h1>Announcements</h1>
            <h3><a href="/createannouncements">Create Announcement</a></h3>
            <table border="1">
                <th>title</th>
                <th>body</th>
                 
                <c:forEach var="announcement" items="${AnnouncementList}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${announcement.title}</td>
                    <td>${announcement.body}</td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>
