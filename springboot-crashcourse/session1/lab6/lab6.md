# Lab 6: Define Your REST API Endpoints

| Resource  | HTTP Verb | Resource URL                                                           | Use Case                                 |
|-----------|-----------|------------------------------------------------------------------------|------------------------------------------|
| Visitor   | POST      | /visitors                                                              | Register new visitor                     |
| Ticket    | POST      | /visitors/{visitorId}/tickets                                          | Visitor {visitorId} buys a ticket        |
| Ticket    | PATCH     | /tickets/{ticketId}                                                    | Update owner of ticket                   |
| Ticket    | GET       | /visitors/{visitorId}/tickets/{ticketId}                               | Get information on ticket of visitor     |
| Ticket    | PATCH     | /visitors/{visitorId}/tickets/{ticketId}                               | Update status of ticket to USED          |
| Visitor   | PATCH     | /visitors/{visitorId}                                                  | Update insideZoo of visitor (enter/leave)|
| Task      | GET       | /visitors/{visitorId}/tasks                                            | Get available tasks                      |
| Task      | POST      | /visitors/{visitorId}/tasks/1/enclosures/{enclosureId}                 | Visit Enclosure {enclosureId}            |
| Task      | GET       | /visitors/{visitorId}/tasks/1/enclosures/{enclosureId}/animals         | Get available animals                    |
| Task      | POST      | /visitors/{visitorId}/tasks/1/enclosures/{enclosureId}/animals/{animalId} | Feed animal {animalId} of enclosure {enclosureId} |
| Task      | POST      | /visitors/{visitorId}/tasks/2/shops/{shopId}                           | Visit Shop {shopId}                      |
| Task      | GET       | /visitors/{visitorId}/tasks/2/shops/{shopId}/items                     | Get available items                      |
| Task      | POST      | /visitors/{visitorId}/tasks/2/shops/{shopId}/items/{itemId}            | Buy item {itemId} of shop {shopId}       |
| Task      | POST      | /visitors/{visitorId}/tasks/3                                          | Visit Hospital                           |
| Task      | POST      | /visitors/{visitorId}/tasks/3/lectures/{lectureId}                     | Listen to lecture {lectureId}            |
| Task      | POST      | /visitors/{visitorId}/tasks/4                                          | Leave Zoo                                |
| Ticket    | DELETE    | /visitors/{visitorId}/tickets/{ticketId}                               | Remove used ticket                       |