import axios from "axios";
import { UrlModel } from '@/models/Url';

export const axiosInstance = axios.create({
    baseURL: "http://localhost:8080/url"
});

export class UrlService {

    shortenUrl(url: UrlModel) {
        return axiosInstance.post('/shorten', url);
    }
}