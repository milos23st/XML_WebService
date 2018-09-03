import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/Observable';

const httpOptions = {
  headers: new HttpHeaders({ 'Content-type': 'application/json'})
};

@Injectable({
  providedIn: 'root'
})
export class CommentsService {

  private url_comments = 'https:/localhost:8443/komentari';

  constructor(private http: HttpClient) { }

    addComment(komentar: Comment, smestajId: string): Observable<Comment> {
    return this.http.post<Comment>(this.url_comments + '/' + smestajId, komentar, httpOptions);
  }


}
