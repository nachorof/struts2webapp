<%@ taglib prefix="w" uri="/struts-tags" %>
 
 <p> 
      <h3> Menu</h3>
      <table>
      		<tr>
      			<td><a href="<w:url action='inbox'/>">Inbox</a></td> <td> | </td>
      			<td><a href="<w:url action='write_message'/>">Write a message</a></td> <td> | </td>
      			<td><a href="<w:url action='logout'/>">Logout</a></td>
      		</tr>
      </table>
</p>