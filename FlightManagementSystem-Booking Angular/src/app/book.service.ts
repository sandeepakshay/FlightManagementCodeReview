import { Injectable, OnInit } from '@angular/core';
import { HttpClient,HttpHeaders } from '@angular/common/http';
import { Book } from './book';
import { Observable } from 'rxjs';
import { stringify } from 'querystring';

@Injectable({
  providedIn: 'root'
})
export class BookService {

  
  private books: Book[]=[];
  //flag:boolean=false;
  constructor(private http: HttpClient) {}
  

  /*********************************************************************
   * Method: loadBooks
   * params: 
   * return: Observable
   * Description: this method is hitting json file 
   *              
   * Created Date: 04 MAR 2020
   * Author: Nishant Shrivastav
   ************************************************************************/
  
  loadBooks():Observable<any>{
    //let url = "../assets/booklist.json";

    return this.http.get("http://localhost:8084/getBooks");
  }

  /*********************************************************************
   * Method: setBooks
   * params: book
   * return: void
   * Description:  this method is seting the values of book into the book array
   *              
   * Created Date: 04 MAR 2020
   * Author: Nishant Shrivastav
   ************************************************************************/
  setBooks(books:Book[]):void {
    this.books=books;
  }

  /*********************************************************************
   * Method: getBooks
   * params: 
   * return: Book[]
   * Description: this methood is returning the book instance after seting
   *              
   * Created Date: 04 MAR 2020
   * Author: Nishant Shrivastav
   ************************************************************************/
  getBooks():Book[]{
    return this.books;
  }

  /*********************************************************************
   * Method: deleteBooks 
   * params: bookid
   * return: Book[]
   * Description: this method is filtering the value which we not need
   *              
   * Created Date: 04 MAR 2020
   * Author: Nishant Shrivastav
   ************************************************************************/

  
  deleteBooks(bookid:number):Observable<any>{

 
    const url='http://localhost:8084/delBook/'+bookid;
    console.log(url);
    return this.http.delete(url);
  }

  /*********************************************************************
   * Method: insertBook
   * params: book
   * return: 
   * Description: this method pushing the data using book instance
   *              
   * Created Date: 04 MAR 2020
   * Author: Nishant Shrivastav
   ************************************************************************/
  insertBooks(book:Book):Observable<any>{
    //this.books.push(book);
    //const str=JSON.stringify(book);
    //console.log(str);
    return this.http.post("http://localhost:8084/book",book,{responseType:"text"});
  }
 
}
